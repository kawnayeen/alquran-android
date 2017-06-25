package com.kawnayeen.alquran.factory.modules;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.kawnayeen.alquran.database.AyatDatabase;
import com.kawnayeen.alquran.database.AyatInfoDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/25/17
 */
@Module(includes = ContextModule.class)
public class DataBaseModule {

    @Provides
    @Singleton
    public AyatDatabase getAyatDatabase(Context context) {
        return Room.databaseBuilder(context, AyatDatabase.class, "alquran").build();
    }

    @Provides
    @Singleton
    public AyatInfoDao getAyatDao(AyatDatabase ayatDatabase) {
        return ayatDatabase.ayatInfoDao();
    }
}
