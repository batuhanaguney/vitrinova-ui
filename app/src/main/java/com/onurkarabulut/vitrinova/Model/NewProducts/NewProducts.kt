package com.onurkarabulut.vitrinova.Model.NewProducts

import com.google.gson.annotations.SerializedName

class NewProducts(
    @SerializedName("title")
    val title: String?,
    @SerializedName("definition")
    val definition: String?,
    @SerializedName("old_price")
    val old_price: Int?,
    @SerializedName("price")
    val price: Int?,
    @SerializedName("stock")
    val stock: Int?,
    @SerializedName("shop")
    val shop: PShop?,
    @SerializedName("images")
    val images: List<PImages>?
) {
}