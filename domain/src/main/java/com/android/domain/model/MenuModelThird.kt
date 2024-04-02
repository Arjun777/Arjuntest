package com.android.domain.model

import com.google.gson.annotations.SerializedName

data class MenuModelThird( @SerializedName("page") var page: PageThird? = PageThird()
)

data class ContentitemThird(

    @SerializedName("content") var content: ArrayList<ContentThird> = arrayListOf()

)

data class PageThird(


    @SerializedName("title") var title: String? = null,
    @SerializedName("total-content-items") var totalcontentitems: String? = null,
    @SerializedName("page-num") var pagenum: String? = null,
    @SerializedName("page-size") var pagesize: String? = null,
    @SerializedName("content-items") var contentitems: ContentitemThird? = ContentitemThird(),
)

data class ContentThird(
    @SerializedName("name") var name: String? = null,
    @SerializedName("poster-image") var posterimage: String? = null
)
