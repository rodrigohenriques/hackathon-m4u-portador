package com.github.fidelity.lio;


import android.app.Application;

import dagger.Module;

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }


}