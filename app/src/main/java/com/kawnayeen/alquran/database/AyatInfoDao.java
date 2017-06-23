package com.kawnayeen.alquran.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.kawnayeen.alquran.model.AyatInfo;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by kawnayeen on 6/18/17.
 */
@Dao
public interface AyatInfoDao {
    @Insert(onConflict = REPLACE)
    void save(AyatInfo ayatInfo);

    @Query("SELECT * FROM " + AyatInfo.TABLE_NAME + " WHERE uniqueId = :uniqueId")
    LiveData<AyatInfo> load(String uniqueId);

    @Query("SELECT COUNT(*) FROM " + AyatInfo.TABLE_NAME)
    int count();
}
