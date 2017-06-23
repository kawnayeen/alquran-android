package com.kawnayeen.alquran.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kawnayeen on 6/19/17.
 */

public class RestClient {
    private static WebServices webServices = null;
    private static final String BASE_URL = "https://muhhsinin.github.io/";

    public static WebServices getWebServices() {
        if (webServices == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            webServices = retrofit.create(WebServices.class);
        }
        return webServices;
    }
}
