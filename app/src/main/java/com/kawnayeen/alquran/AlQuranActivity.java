package com.kawnayeen.alquran;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.util.Log;

import com.kawnayeen.alquran.viewmodel.AyatInfoViewModel;

public class AlQuranActivity extends LifecycleActivity {

    private AyatInfoViewModel ayatInfoViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_quran);
        ayatInfoViewModel = ViewModelProviders.of(this).get(AyatInfoViewModel.class);
        ayatInfoViewModel.init("003", "001");
        ayatInfoViewModel.getAyatInfo().observe(this, ayatInfo -> Log.i("kamarul", ayatInfo.getEnglishText()));
    }
}
