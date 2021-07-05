package com.onurkarabulut.vitrinova.Model.Featured

import com.google.gson.annotations.SerializedName

class Featured(
    @SerializedName("id")
    val id: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("cover")
    val cover: FCover,
    @SerializedName("title")
    val title: String,
    @SerializedName("sub_title")
    val sub_title: String
) {

}