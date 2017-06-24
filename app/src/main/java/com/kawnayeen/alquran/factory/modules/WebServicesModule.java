package com.kawnayeen.alquran.factory.modules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kawnayeen.alquran.networking.WebServices;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/24/17
 */
@Module(includes = NetworkModule.class)
public class WebServicesModule {
    private static final String BASE_URL = "https://muhhsinin.github.io/";

    @Provides
    @Singleton
    public WebServices getWebServices(Retrofit retrofit) {
        return retrofit.create(WebServices.class);
    }

    @Provides
    @Singleton
    public Retrofit retrofit(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    @Provides
    @Singleton
    public Gson gson() {
        return new GsonBuilder().create();
    }
}
