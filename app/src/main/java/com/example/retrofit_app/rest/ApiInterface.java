package com.example.retrofit_app.rest;


import com.example.retrofit_app.model.Company;
import com.example.retrofit_app.model.Response;
import com.example.retrofit_app.model.User;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    @GET("users")
    Call<List<User>> getUsers();
}
