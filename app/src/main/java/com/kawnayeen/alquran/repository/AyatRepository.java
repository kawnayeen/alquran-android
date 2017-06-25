package com.kawnayeen.alquran.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.kawnayeen.alquran.database.AyatInfoDao;
import com.kawnayeen.alquran.model.AyatInfo;
import com.kawnayeen.alquran.networking.WebServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kawnayeen on 6/19/17.
 */
public class AyatRepository {
    private WebServices webServices;
    private AyatInfoDao ayatInfoDao;

    public AyatRepository(WebServices webServices, AyatInfoDao ayatInfoDao) {
        this.webServices = webServices;
        this.ayatInfoDao = ayatInfoDao;
    }

    public LiveData<AyatInfo> getAyat(String surahNumber, String ayatNumber) {
        final MutableLiveData<AyatInfo> data = new MutableLiveData<>();
        webServices.getAyatInfo(surahNumber, surahNumber + ayatNumber + ".json").enqueue(new Callback<AyatInfo>() {
            @Override
            public void onResponse(Call<AyatInfo> call, Response<AyatInfo> response) {
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<AyatInfo> call, Throwable t) {
            }
        });
        return data;
    }
}
