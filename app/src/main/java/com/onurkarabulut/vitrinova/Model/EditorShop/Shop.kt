package com.onurkarabulut.vitrinova.Model.EditorShop

import com.google.gson.annotations.SerializedName
import com.onurkarabulut.vitrinova.Model.NewProducts.NewProducts

class Shop(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("product_count")
    val product_count: Int,
    @SerializedName("popular_products")
    val popular_products: List<NewProducts>,
    @SerializedName("cover")
    val cover: ECover?,
    @SerializedName("logo")
    val logo: ELogo?

) {
}