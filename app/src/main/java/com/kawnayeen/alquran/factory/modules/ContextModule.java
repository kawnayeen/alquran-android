package com.kawnayeen.alquran.factory.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/25/17
 */
@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context getContext() {
        return context;
    }
}
