package com.onurkarabulut.vitrinova.ViewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.onurkarabulut.vitrinova.Model.VitrinovaModel
import com.onurkarabulut.vitrinova.Service.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DiscoverViewModel(application: Application): AndroidViewModel(application) {
    private val apiClient = ApiClient()
    private val TAG = "DiscoverFragmentViewModel"
    val data = MutableLiveData<List<VitrinovaModel>>()
    val loading = MutableLiveData<Boolean>()


    fun getDatasFromAPI() {
        loading.value = true
        apiClient.api.getDatas().enqueue(object : Callback<List<VitrinovaModel>>{
            override fun onResponse(
                call: Call<List<VitrinovaModel>>,
                response: Response<List<VitrinovaModel>>
            ) {
                data.value = response.body()
                loading.value = false
            }
            override fun onFailure(call: Call<List<VitrinovaModel>>, t: Throwable) {
                Log.e(TAG, "onFailure $t")
            }

        })
    }
}