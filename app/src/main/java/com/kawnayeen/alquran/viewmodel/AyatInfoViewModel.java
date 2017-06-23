package com.kawnayeen.alquran.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.kawnayeen.alquran.model.AyatInfo;

/**
 * Created by kawnayeen on 6/19/17.
 */
public class AyatInfoViewModel extends ViewModel {
    private LiveData<AyatInfo> ayatInfo;
    private String ayatNumber;
    private String surahNumber;

    public void init(String ayatNumber, String surahNumber) {
        this.ayatNumber = ayatNumber;
        this.surahNumber = surahNumber;
    }

    public LiveData<AyatInfo> getAyatInfo() {
        return ayatInfo;
    }
}
