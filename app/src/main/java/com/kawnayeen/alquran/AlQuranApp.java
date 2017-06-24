package com.kawnayeen.alquran;

import android.app.Application;

import com.kawnayeen.alquran.factory.AlQuranAppComponent;
import com.kawnayeen.alquran.factory.DaggerAlQuranAppComponent;

/**
 * Developed by : kawnayeen
 * Creation Date : 6/25/17
 */
public class AlQuranApp extends Application {
    private static AlQuranAppComponent alQuranAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        alQuranAppComponent = DaggerAlQuranAppComponent.builder().build();
    }

    public static AlQuranAppComponent getAlQuranAppComponent() {
        return alQuranAppComponent;
    }
}
