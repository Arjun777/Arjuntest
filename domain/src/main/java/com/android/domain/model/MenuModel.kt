package com.android.domain.model

import com.google.gson.annotations.SerializedName



data class MenuModel(
    @SerializedName("page") var page: Page? = Page()
)

data class Contentitems(

    @SerializedName("content") var content: ArrayList<Content> = arrayListOf()

)

data class Page(


    @SerializedName("title") var title: String? = null,
    @SerializedName("total-content-items") var totalcontentitems: String? = null,
    @SerializedName("page-num") var pagenum: String? = null,
    @SerializedName("page-size") var pagesize: String? = null,
    @SerializedName("content-items") var contentitems: Contentitems? = Contentitems(),
)

data class Content(
    @SerializedName("name") var name: String? = null,
    @SerializedName("poster-image") var posterimage: String? = null
)