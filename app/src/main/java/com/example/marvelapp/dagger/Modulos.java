package com.example.marvelapp.dagger;

import com.example.marvelapp.services.MarvelService;

import javax.inject.Singleton;

import dagger.Module;

import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public abstract class Modulos {
    @Singleton
    @Provides static Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://gateway.marvel.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    @Singleton
    @Provides static MarvelService proverMarvelService(Retrofit retrofit) {
        return retrofit.create(MarvelService.class);
    }
}
