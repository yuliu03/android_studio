package com.example.retrofit_gson_okhttp.Service;

import com.example.retrofit_gson_okhttp.Entity.PhoneResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface PhoneService {
    //@Header用来添加Header
    @GET("/apistore/mobilenumber/mobilenumber")
    Call<PhoneResult> getResult(@Header("apikey") String apikey, @Query("phone") String phone);
}
