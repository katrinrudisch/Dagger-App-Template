package com.katrinrudisch.daggertemplate.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.katrinrudisch.daggertemplate.R
import com.katrinrudisch.daggertemplate.extensions.activityComponent
import com.katrinrudisch.daggertemplate.service.ApiService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
