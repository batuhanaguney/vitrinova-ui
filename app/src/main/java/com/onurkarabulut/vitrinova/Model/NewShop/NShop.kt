package com.onurkarabulut.vitrinova.Model.NewShop

import com.google.gson.annotations.SerializedName



class NShop(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("product_count")
    val product_count: Int,
    @SerializedName("cover")
    val cover: NCover,
    @SerializedName("logo")
    val logo: NLogo

) {
}