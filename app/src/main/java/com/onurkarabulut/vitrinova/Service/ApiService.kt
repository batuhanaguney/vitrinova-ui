package com.onurkarabulut.vitrinova.Service


import com.onurkarabulut.vitrinova.Model.VitrinovaModel
import retrofit2.http.GET

interface ApiService {
    @GET("/api/v2/discover")
    fun getDatas(): retrofit2.Call<List<VitrinovaModel>>
}