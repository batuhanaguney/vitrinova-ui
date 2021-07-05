package com.onurkarabulut.vitrinova.Model.NewProducts

import com.google.gson.annotations.SerializedName

class PMedium(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("url")
    val url: String?,
) {
}