package com.example.marvelapp.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private static final String BASE_URL = "http://gateway.marvel.com/v1/public/";

    private Retrofit retrofit;

    public RetrofitService(Retrofit retrofit) {
        retrofit = retrofit;
    }

    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();



        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();


    }
}


