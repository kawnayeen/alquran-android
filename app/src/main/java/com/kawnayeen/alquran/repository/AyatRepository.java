package com.kawnayeen.alquran.repository;

import com.kawnayeen.alquran.AlQuranApp;
import com.kawnayeen.alquran.networking.WebServices;

import javax.inject.Inject;

/**
 * Created by kawnayeen on 6/19/17.
 */
public class AyatRepository {
    @Inject
    public WebServices webServices;

    public AyatRepository() {
        AlQuranApp.getAlQuranAppComponent().injectAyatRepository(this);
    }
}
