package com.kawnayeen.alquran.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.kawnayeen.alquran.AlQuranApp;
import com.kawnayeen.alquran.model.AyatInfo;
import com.kawnayeen.alquran.repository.AyatRepository;

import javax.inject.Inject;

/**
 * Created by kawnayeen on 6/19/17.
 */
public class AyatInfoViewModel extends ViewModel {
    @Inject
    public AyatRepository ayatRepository;
    private LiveData<AyatInfo> ayatInfo;
    private String ayatNumber;
    private String surahNumber;

    public AyatInfoViewModel() {
        AlQuranApp.getAlQuranAppComponent().injectAyatRepository(this);
    }

    public void init(String ayatNumber, String surahNumber) {
        this.ayatNumber = ayatNumber;
        this.surahNumber = surahNumber;
        ayatInfo = ayatRepository.getAyat(surahNumber, ayatNumber);
    }

    public LiveData<AyatInfo> getAyatInfo() {
        return ayatInfo;
    }
}
