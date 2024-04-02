package com.android.presentation.media



import android.app.ProgressDialog
import android.content.res.Configuration
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.android.domain.model.Content
import com.android.domain.model.ContentSecond
import com.android.domain.model.ContentThird
import com.android.domain.model.MenuModel
import com.android.presentation.R
import com.android.presentation.adapter.MediaAdapter
import com.android.presentation.databinding.MediaActivityBinding
import com.android.presentation.utils.ReadJSONFromAssets
import com.google.firebase.FirebaseApp
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale
import java.util.Objects


@AndroidEntryPoint
class MediaActivity : AppCompatActivity() {
    private var crashlytics: FirebaseCrashlytics? = null
    lateinit var binding: MediaActivityBinding
    private val viewModel: MediaViewModel by viewModels()
    var contentpage1: MutableList<Content> = ArrayList()
    var contentpage2: MutableList<ContentSecond> = ArrayList()
    var contentpage3: MutableList<ContentThird> = ArrayList()
    val modeListResult = mutableListOf<Content>()
    private var isLoading: Boolean = false
    lateinit var adapter: MediaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MediaActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FirebaseApp.initializeApp(this)
        init();
        addScrollerListener()

    }
    private fun init() {

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Romantic Comedy"
        viewModel.loadContent()
        //set back button
        actionbar?.setBackgroundDrawable(
            ColorDrawable(ContextCompat.getColor(this, R.color.appcolor))
        )
        actionbar.setDisplayHomeAsUpEnabled(true)
        modeListResult.clear()
        val mProgressDialog = ProgressDialog(this)
        mProgressDialog.setTitle("Welcome")
        mProgressDialog.setMessage("Please Wait")
        mProgressDialog.show()

        val model = readFromPageAsset();

        adapter = MediaAdapter(model, this)
        val orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            binding.recyclerView.layoutManager =
                StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL)
        } else {
            binding.recyclerView.layoutManager =
                StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        }

        binding.recyclerView.adapter = adapter;
        mProgressDialog.dismiss()
        adapter.setOnItemClickListener(object : MediaAdapter.ClickListener {
            override fun onClick(pos: Int, aView: View) {
                Toast.makeText(this@MediaActivity, model.get(pos).name, Toast.LENGTH_SHORT).show()
            }
        })


    }


    private fun addScrollerListener() {
        //attaches scrollListener with RecyclerView
        binding.recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (!isLoading) {
                    //findLastCompletelyVisibleItemPostition() returns position of last fully visible view.
                    ////It checks, fully visible view is the last one.
                    if (isLastItemDisplaying(binding.recyclerView)) {
                        Log.d("currentp", isLastItemDisplaying(binding.recyclerView).toString());

                        loadMore()
                        isLoading = true

                    }
                }
            }
        })


    }


    //return true if it's last item visited
    private fun isLastItemDisplaying(recyclerView: RecyclerView): Boolean {
        if (recyclerView.adapter!!.itemCount != 0) {
            //int lastVisibleItemPosition = ((StaggeredGridLayoutManager)recyclerView.getLayoutManager()).findLastVisibleItemPositions();
            val lastVisibleItemPositions =
                (Objects.requireNonNull(recyclerView.layoutManager) as StaggeredGridLayoutManager).findLastVisibleItemPositions(
                    null
                )
            // get maximum element within the list
            val lastVisibleItemPosition = getLastVisibleItem(lastVisibleItemPositions)
            return lastVisibleItemPosition != RecyclerView.NO_POSITION && lastVisibleItemPosition == recyclerView.adapter!!
                .itemCount - 1
        }
        return false
    }


    //get last item
    fun getLastVisibleItem(lastVisibleItemPositions: IntArray): Int {
        var maxSize = 0
        for (i in lastVisibleItemPositions.indices) {
            if (i == 0) {
                maxSize = lastVisibleItemPositions[i]
            } else if (lastVisibleItemPositions[i] > maxSize) {
                maxSize = lastVisibleItemPositions[i]
            }
        }
        return maxSize
    }

    private fun loadMore() {
        val handler = android.os.Handler()
        //notify adapter using Handler.post() or RecyclerView.post()
        handler.post(Runnable
        {

            readFromSecondAsset()
            //modeListResult.add("load")
            adapter.notifyItemInserted(modeListResult.size - 1)

        })

        handler.postDelayed(Runnable {

            //removes "load".
            modeListResult.removeAt(modeListResult.size - 1)
            var listSize = modeListResult.size

            adapter.notifyItemRemoved(listSize)
            //sets next limit

            readFromatThirdAsset()

            val uniqueVertices = modeListResult.toHashSet()
            uniqueVertices.forEach {
                println(it)
            }

            adapter.notifyDataSetChanged()
            isLoading = false

        }, 2500)
    }

//MenuBar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        val item = menu?.findItem(R.id.action_search);
        val searchView = item?.actionView as SearchView
        val searchBitmap = ContextCompat.getDrawable(this, R.drawable.search)?.toBitmap()
        searchBitmap?.let {
            item?.icon = BitmapDrawable(resources, Bitmap.createScaledBitmap(it, 24, 24, true))
        }


        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
                return true
            }

            override fun onQueryTextChange(query: String?): Boolean {
                val s: StringBuilder
                s = StringBuilder(query.toString())
                var i = 3

                if (i <= s.length) {
                    query?.let { filter(it) };
                } else {
                    filter("")
                }

                return true
            }
        })


        searchView.setOnQueryTextFocusChangeListener { v, newViewFocus ->
            if (!newViewFocus) {
                //Collapse the action item.
                Log.d("okkkkkkkkkkk", "okkkkkkk")
                item.collapseActionView()
                //Clear the filter/search query.
                supportActionBar?.setDisplayShowTitleEnabled(true);
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            } else {
                supportActionBar?.setDisplayShowTitleEnabled(false);
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }
        }
        item.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {

            override fun onMenuItemActionExpand(p0: MenuItem): Boolean {
                showToast("Action Expand")
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
                return true
            }

            override fun onMenuItemActionCollapse(p0: MenuItem): Boolean {
                // adapter?.filter?.filter("")
                filter("")
                showToast("Action Collapse")
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
                return true
            }
        })

        return super.onCreateOptionsMenu(menu)
    }


    private fun filter(text: String) {
        // creating a new array list to filter our data.
        val filteredlist: ArrayList<Content> = ArrayList<Content>()

        // running a for loop to compare elements.
        for (item in modeListResult) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.name?.toLowerCase()!!.contains(text.lowercase(Locale.getDefault()))) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item)
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show()
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            adapter.filterList(filteredlist, text)
        }
    }



    private fun showToast(msg: String) {
        Toast.makeText(this@MediaActivity, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



    private fun readFromPageAsset(): List<Content> {

        val modeList = mutableListOf<Content>()

        val page1 = ReadJSONFromAssets(baseContext, "CONTENTLISTINGPAGE-PAGE1.json")
        Gson().fromJson(page1, MenuModel::class.java)
        val pagesmenu1 = Gson().fromJson(page1, MenuModel::class.java)
        pagesmenu1.let {
            contentpage1 = it.page?.contentitems?.content!!


            for (i in 0..contentpage1.size - 1) {
                val model = Content(
                    it.page?.contentitems?.content!!.get(i).name,
                    it.page?.contentitems?.content!!.get(i).posterimage
                )
                modeListResult.clear()
                modeList.add(model)
                modeListResult.add(model)
                Log.d("1111model", modeListResult.size.toString())
            }
        }
        return modeListResult
    }


    private fun readFromSecondAsset(): List<Content> {
        val page2 = ReadJSONFromAssets(baseContext, "CONTENTLISTINGPAGE-PAGE2.json")
        Gson().fromJson(page2, MenuModel::class.java)
        val pagesmenu1 = Gson().fromJson(page2, MenuModel::class.java)
        pagesmenu1.let {
            contentpage1 = it.page?.contentitems?.content!!


            for (i in 0..contentpage1.size - 1) {
                val model = Content(
                    it.page?.contentitems?.content!!.get(i).name,
                    it.page?.contentitems?.content!!.get(i).posterimage
                )
                modeListResult.add(model)
                Log.d("222modelllll", modeListResult.size.toString())
            }
        }
        return modeListResult
    }


    private fun readFromatThirdAsset(): List<Content> {

        val page3 = ReadJSONFromAssets(baseContext, "CONTENTLISTINGPAGE-PAGE3.json")
        Gson().fromJson(page3, MenuModel::class.java)
        val pagesmenu1 = Gson().fromJson(page3, MenuModel::class.java)
        pagesmenu1.let {
            contentpage1 = it.page?.contentitems?.content!!


            for (i in 0..contentpage1.size - 1) {
                val model = Content(
                    it.page?.contentitems?.content!!.get(i).name,
                    it.page?.contentitems?.content!!.get(i).posterimage
                )

                modeListResult.add(model)
                Log.d("33333model", modeListResult.size.toString())
            }
        }
        return modeListResult
    }


}