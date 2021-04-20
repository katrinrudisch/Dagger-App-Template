package com.katrinrudisch.daggertemplate

import androidx.lifecycle.ViewModel
import com.katrinrudisch.daggertemplate.service.ApiService
import javax.inject.Inject

class MainViewModel @Inject constructor(private val apiService: ApiService) : ViewModel() {

    fun loadSomething() {
        apiService.getResponse()
    }
}