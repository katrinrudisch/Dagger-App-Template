package com.katrinrudisch.daggertemplate.extensions

import android.app.Activity
import com.katrinrudisch.daggertemplate.TemplateApplication
import com.katrinrudisch.daggertemplate.injection.component.AppComponent

fun Activity.activityComponent(): AppComponent {
    return (this.application as TemplateApplication).appComponent
}