package com.onurkarabulut.vitrinova.Model.Collections

import com.google.gson.annotations.SerializedName

class Collections(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("cover")
    val cover: CoCover
) {
}