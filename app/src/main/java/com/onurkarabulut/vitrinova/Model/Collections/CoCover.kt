package com.onurkarabulut.vitrinova.Model.Collections

import com.google.gson.annotations.SerializedName

class CoCover(
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("url")
    val url: String
) {
}