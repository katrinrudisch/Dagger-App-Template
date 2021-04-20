package com.katrinrudisch.daggertemplate.injection.component.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.katrinrudisch.daggertemplate.MainViewModel
import com.katrinrudisch.daggertemplate.injection.component.ViewModelFactory
import com.katrinrudisch.daggertemplate.injection.component.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey( MainViewModel::class )
    abstract fun bindMainViewModel( mainViewModel: MainViewModel ): ViewModel
}