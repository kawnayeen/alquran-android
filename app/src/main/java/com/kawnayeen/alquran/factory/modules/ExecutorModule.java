package com.kawnayeen.alquran.factory.modules;

import com.kawnayeen.alquran.async.AppExecutor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/25/17
 */
@Module
public class ExecutorModule {
    @Provides
    @Singleton
    public AppExecutor getExecutor() {
        return new AppExecutor();
    }
}
