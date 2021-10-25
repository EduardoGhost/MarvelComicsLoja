package com.example.marvelapp.services;

import dagger.Module;
import dagger.Provides;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



//@Module: Anotação utilizada em classes que fornecem dependências.
//@Provides: Anotação utilizadas em métodos que proveem dependências, os métodos provedores são encontrados nas classes com a anotação @Module.

@Module
public class RetrofitService {

    private static final String BASE_URL = "http://gateway.marvel.com/v1/public/";

    //talves mudar para estatico
   @Provides @Singleton
   Retrofit proverRetrofit(){
       return new Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
               .addConverterFactory(GsonConverterFactory.create())
               .build();

   }


    }

    



