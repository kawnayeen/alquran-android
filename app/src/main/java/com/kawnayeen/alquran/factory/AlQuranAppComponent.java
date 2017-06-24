package com.kawnayeen.alquran.factory;

import com.kawnayeen.alquran.factory.modules.WebServicesModule;
import com.kawnayeen.alquran.repository.AyatRepository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/24/17
 */
@Component(modules = WebServicesModule.class)
@Singleton
public interface AlQuranAppComponent {
    void injectAyatRepository(AyatRepository ayatRepository);
}
