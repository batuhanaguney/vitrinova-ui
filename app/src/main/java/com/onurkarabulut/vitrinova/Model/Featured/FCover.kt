package com.onurkarabulut.vitrinova.Model.Featured

import com.google.gson.annotations.SerializedName

class FCover(
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("medium")
    val medium: FMedium,
    @SerializedName("thumbnail")
    val thumbnail: FThumbnail
) {
}