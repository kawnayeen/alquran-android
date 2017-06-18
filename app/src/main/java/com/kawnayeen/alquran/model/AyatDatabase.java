package com.kawnayeen.alquran.model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by kawnayeen on 6/18/17.
 */
@Database(entities = {AyatInfo.class}, version = 1)
public abstract class AyatDatabase extends RoomDatabase {
    public abstract AyatInfoDao ayatInfoDao();
}
