package com.android.domain.model

import com.google.gson.annotations.SerializedName

data class MenumodelSecond(
    @SerializedName("page") var page: PageSecond? = PageSecond()
)

data class ContentitemsSecond(

    @SerializedName("content") var content: ArrayList<ContentSecond> = arrayListOf()

)

data class PageSecond(


    @SerializedName("title") var title: String? = null,
    @SerializedName("total-content-items") var totalcontentitems: String? = null,
    @SerializedName("page-num") var pagenum: String? = null,
    @SerializedName("page-size") var pagesize: String? = null,
    @SerializedName("content-items") var contentitems: ContentitemsSecond? = ContentitemsSecond(),
)

data class ContentSecond(
    @SerializedName("name") var name: String? = null,
    @SerializedName("poster-image") var posterimage: String? = null
)
