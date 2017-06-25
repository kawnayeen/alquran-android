package com.kawnayeen.alquran.repository;

import android.arch.lifecycle.LiveData;

import com.kawnayeen.alquran.async.AppExecutor;
import com.kawnayeen.alquran.database.AyatInfoDao;
import com.kawnayeen.alquran.model.AyatInfo;
import com.kawnayeen.alquran.networking.WebServices;

import java.io.IOException;
import java.util.concurrent.Executors;

import retrofit2.Response;

/**
 * Created by kawnayeen on 6/19/17.
 */
public class AyatRepository {
    private WebServices webServices;
    private AyatInfoDao ayatInfoDao;
    private AppExecutor executor;

    public AyatRepository(WebServices webServices, AyatInfoDao ayatInfoDao, AppExecutor executor) {
        this.webServices = webServices;
        this.ayatInfoDao = ayatInfoDao;
        this.executor = executor;
    }

    public LiveData<AyatInfo> getAyat(String surahNumber, String ayatNumber) {
        fetchAyatIfRequired(surahNumber, ayatNumber);
        return ayatInfoDao.load(getUniqueId(surahNumber, ayatNumber));
    }

    private void fetchAyatIfRequired(String surahNumber, String ayatNumber) {
        Executors.newSingleThreadExecutor().execute(() -> {
            String uniqueId = getUniqueId(surahNumber, ayatNumber);
            boolean isExists = ayatInfoDao.isAyatExists(uniqueId) == 1;
            if (!isExists) {
                try {
                    Response<AyatInfo> response = webServices.getAyatInfo(surahNumber, uniqueId + ".json").execute();
                    if (response.isSuccessful()) {
                        AyatInfo ayatInfo = response.body();
                        ayatInfo.generateUniqueId();
                        ayatInfoDao.save(ayatInfo);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private String getUniqueId(String surahNumber, String ayatNumber) {
        return surahNumber + ayatNumber;
    }
}
