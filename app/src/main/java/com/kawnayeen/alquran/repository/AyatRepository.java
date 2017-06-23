package com.kawnayeen.alquran.repository;

import com.kawnayeen.alquran.networking.RestClient;
import com.kawnayeen.alquran.networking.WebServices;

/**
 * Created by kawnayeen on 6/19/17.
 */

public class AyatRepository {
    private WebServices webServices = null;

    public AyatRepository() {
        webServices = RestClient.getWebServices();
    }
}
