package com.github.fidelity.lio.di;


import android.app.Application;

import dagger.Module;

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }


}