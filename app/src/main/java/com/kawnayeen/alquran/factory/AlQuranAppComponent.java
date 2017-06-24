package com.kawnayeen.alquran.factory;

import com.kawnayeen.alquran.factory.modules.WebServicesModule;
import com.kawnayeen.alquran.networking.WebServices;

import dagger.Component;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/24/17
 */
@Component(modules = WebServicesModule.class)
public interface AlQuranAppComponent {
    WebServices getWebServices();
}
