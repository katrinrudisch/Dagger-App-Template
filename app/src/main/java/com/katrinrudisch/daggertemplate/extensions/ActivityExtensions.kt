package com.katrinrudisch.daggertemplate.extensions

import android.app.Activity
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.katrinrudisch.daggertemplate.TemplateApplication
import com.katrinrudisch.daggertemplate.injection.component.AppComponent

fun Activity.activityComponent(): AppComponent {
    return (this.application as TemplateApplication).appComponent
}

inline fun <reified T : ViewModel> FragmentActivity.getViewModel(): T {
    return ViewModelProvider(this, activityComponent().viewModelFactory).get(T::class.java)
}