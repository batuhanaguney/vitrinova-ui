package com.onurkarabulut.vitrinova.Model.NewProducts

import com.google.gson.annotations.SerializedName


class PImages(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("medium")
    val medium: PMedium?,
    @SerializedName("thumbnail")
    val thumbnail: PMedium?,
) {
}