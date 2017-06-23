package com.kawnayeen.alquran.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.kawnayeen.alquran.model.AyatInfo;

/**
 * Created by kawnayeen on 6/18/17.
 */
@Database(entities = {AyatInfo.class}, version = 1)
public abstract class AyatDatabase extends RoomDatabase {
    public abstract AyatInfoDao ayatInfoDao();
}
