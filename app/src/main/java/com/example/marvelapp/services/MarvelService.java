package com.example.marvelapp.services;

import com.example.marvelapp.model.ResponseData;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MarvelService {

    @GET("comics?ts=1&apikey=87eae2cc29e0e5c27e1978b9b1d484f5&hash=fddd12b1cc463430b1ef5e4853f20b8a")
    Observable<ResponseData> getComics();


}
