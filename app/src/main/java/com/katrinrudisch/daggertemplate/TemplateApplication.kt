package com.katrinrudisch.daggertemplate

import android.app.Application
import com.katrinrudisch.daggertemplate.injection.component.AppComponent
import com.katrinrudisch.daggertemplate.injection.component.DaggerAppComponent
import timber.log.Timber

class TemplateApplication : Application(){

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = initDagger()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initDagger(): AppComponent {
        return DaggerAppComponent.builder()
            .build()
    }
}