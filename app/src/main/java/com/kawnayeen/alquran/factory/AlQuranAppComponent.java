package com.kawnayeen.alquran.factory;

import com.kawnayeen.alquran.factory.modules.RepositoryModule;
import com.kawnayeen.alquran.viewmodel.AyatInfoViewModel;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/24/17
 */
@Component(modules = {RepositoryModule.class})
@Singleton
public interface AlQuranAppComponent {
    void injectAyatRepository(AyatInfoViewModel ayatInfoViewModel);
}
