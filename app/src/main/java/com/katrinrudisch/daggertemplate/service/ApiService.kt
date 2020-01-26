package com.katrinrudisch.daggertemplate.service

import com.katrinrudisch.daggertemplate.model.Response
import io.reactivex.Observable

interface ApiService{

    fun getResponse(): Observable<Response>
}