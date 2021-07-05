package com.onurkarabulut.vitrinova.Model

import com.google.gson.annotations.SerializedName
import com.onurkarabulut.vitrinova.Model.Categories.Categories
import com.onurkarabulut.vitrinova.Model.Collections.Collections
import com.onurkarabulut.vitrinova.Model.EditorShop.Shop
import com.onurkarabulut.vitrinova.Model.Featured.Featured
import com.onurkarabulut.vitrinova.Model.NewProducts.NewProducts
import com.onurkarabulut.vitrinova.Model.NewShop.NShop

class VitrinovaModel(
    @SerializedName("type")
    val type: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("featured")
    val featured: List<Featured>,
    @SerializedName("products")
    val products: List<NewProducts>,
    @SerializedName("categories")
    val categories: List<Categories>,
    @SerializedName("collections")
    val collections: List<Collections>,
    @SerializedName("shops")
    val shops: List<Shop>,


) {
}