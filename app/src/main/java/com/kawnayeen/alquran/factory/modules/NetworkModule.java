package com.kawnayeen.alquran.factory.modules;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/24/17
 */
@Module
public class NetworkModule {
    @Provides
    public OkHttpClient okHttpClient() {
        return new OkHttpClient.Builder().build();
    }
}
