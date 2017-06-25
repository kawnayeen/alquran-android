package com.kawnayeen.alquran.factory.modules;

import com.kawnayeen.alquran.async.AppExecutor;
import com.kawnayeen.alquran.database.AyatInfoDao;
import com.kawnayeen.alquran.networking.WebServices;
import com.kawnayeen.alquran.repository.AyatRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/25/17
 */
@Module(includes = {WebServicesModule.class, DataBaseModule.class, ExecutorModule.class})
public class RepositoryModule {
    @Provides
    @Singleton
    public AyatRepository getAyatRepository(WebServices webServices, AyatInfoDao ayatInfoDao, AppExecutor appExecutor) {
        return new AyatRepository(webServices, ayatInfoDao, appExecutor);
    }
}
