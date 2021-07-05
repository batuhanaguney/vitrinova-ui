package com.onurkarabulut.vitrinova.Model.Categories

import com.google.gson.annotations.SerializedName

class CLogo(
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("url")
    val url: String,
) {
}