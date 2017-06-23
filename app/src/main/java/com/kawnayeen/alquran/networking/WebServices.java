package com.kawnayeen.alquran.networking;

import com.kawnayeen.alquran.model.AyatInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by kawnayeen on 6/19/17.
 */
public interface WebServices {
    @GET("resources/ayat/{surahId}/{ayatId}")
    Call<AyatInfo> getAyatInfo(@Path("surahId") String surahId, @Path("ayatId") String ayatId);
}
