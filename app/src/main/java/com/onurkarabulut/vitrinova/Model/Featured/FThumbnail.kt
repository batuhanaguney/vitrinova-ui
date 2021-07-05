package com.onurkarabulut.vitrinova.Model.Featured

import com.google.gson.annotations.SerializedName

class FThumbnail(
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("url")
    val url: String,
) {
}