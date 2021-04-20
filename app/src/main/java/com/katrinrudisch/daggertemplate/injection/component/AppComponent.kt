package com.katrinrudisch.daggertemplate.injection.component

import androidx.lifecycle.ViewModelProvider
import com.katrinrudisch.daggertemplate.injection.component.module.AppModule
import com.katrinrudisch.daggertemplate.injection.component.module.NetworkModule
import com.katrinrudisch.daggertemplate.injection.component.module.ViewModelModule
import com.katrinrudisch.daggertemplate.ui.MainActivity
import com.katrinrudisch.daggertemplate.ui.SecondActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {

    val viewModelFactory: ViewModelProvider.Factory

    fun inject(activity: MainActivity)

    fun inject(activity: SecondActivity)
}