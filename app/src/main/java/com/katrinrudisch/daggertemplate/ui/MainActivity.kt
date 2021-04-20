package com.katrinrudisch.daggertemplate.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.katrinrudisch.daggertemplate.MainViewModel
import com.katrinrudisch.daggertemplate.R
import com.katrinrudisch.daggertemplate.extensions.activityComponent
import com.katrinrudisch.daggertemplate.extensions.getViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val mainViewModel by lazy { getViewModel<MainViewModel>() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.activityComponent().inject(this)

        mainViewModel.loadSomething()
    }
}
