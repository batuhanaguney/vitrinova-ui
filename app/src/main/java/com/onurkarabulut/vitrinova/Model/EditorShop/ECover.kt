package com.onurkarabulut.vitrinova.Model.EditorShop

import com.google.gson.annotations.SerializedName

class ECover(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("url")
    val url: String?,
) {
}