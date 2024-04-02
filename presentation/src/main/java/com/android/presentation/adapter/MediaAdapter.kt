package com.android.presentation.adapter

import android.content.Context
import android.graphics.Color
import android.text.Spannable
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.domain.model.Content
import com.android.presentation.R
import kotlinx.android.synthetic.main.row_media_item.view.img
import kotlinx.android.synthetic.main.row_media_item.view.txt
import java.util.Locale


class MediaAdapter(var modelList: List<Content>, val context: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var searchString = ""

    init {
        setHasStableIds(true)
    }

    companion object {
        private const val VIEW_TYPE_DATA = 0
        private const val VIEW_TYPE_PROGRESS = 1
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(modelList.get(position))

        val message: Content = modelList.get(position)

        val name: String = message.name!!.toLowerCase(Locale.getDefault())

        if (name.contains(searchString)) {
            val startPos: Int = name.indexOf(searchString)
            val endPos: Int = startPos + searchString.length
            val spanString =
                Spannable.Factory.getInstance().newSpannable(holder.itemView.txt.getText())
            spanString.setSpan(
                ForegroundColorSpan(Color.YELLOW),
                startPos,
                endPos,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            holder.itemView.txt.setText(spanString)
        }

    }

    // method for filtering our recyclerview items.
    fun filterList(filterlist: ArrayList<Content>, text: String) {
        // below line is to add our filtered
        // list in our course array list.
        searchString = text

        modelList = filterlist
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_DATA -> {//inflates row layout
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.row_media_item, parent, false)
                ViewHolder(view)
            }

            VIEW_TYPE_PROGRESS -> {//inflates progressbar layout
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_loading, parent, false)
                ProgressViewHolder(view)
            }

            else -> throw IllegalArgumentException("Different View type")
        }


    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return modelList.size
    }


    override fun getItemViewType(position: Int): Int {
        var viewtype = modelList.get(position)
        Log.d("viewwwwww", viewtype.toString())

        return when (viewtype) {//if data is load, returns PROGRESSBAR viewtype.
            // viewtype  -> VIEW_TYPE_PROGRESS
            else -> VIEW_TYPE_DATA
        }
    }

    lateinit var mClickListener: ClickListener

    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }

    interface ClickListener {
        fun onClick(pos: Int, aView: View)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            mClickListener.onClick(adapterPosition, itemView)
        }

        fun bind(model: Content): Unit {
            itemView.txt.text = model.name
            if (model.posterimage.toString().contains("posterthatismissing")) {
                itemView.img.setImageResource(R.drawable.profile);

            } else {
                val id = context.resources.getIdentifier(
                    model.posterimage?.replace(".jpg", ""),
                    "drawable",
                    context.packageName
                )
                itemView.img.setImageResource(id)
                Log.d("context.packageName", context.packageName)
                Log.d("posterimageee", model.posterimage.toString())
            }

        }

    }


    inner class ProgressViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}