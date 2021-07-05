package com.onurkarabulut.vitrinova.Model.Categories

import com.google.gson.annotations.SerializedName

class Categories(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("logo")
    val logo: CLogo
) {
}