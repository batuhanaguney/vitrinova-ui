package com.onurkarabulut.vitrinova.Model.NewShop

import com.google.gson.annotations.SerializedName

class NLogo(
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("url")
    val url: String,
) {
}