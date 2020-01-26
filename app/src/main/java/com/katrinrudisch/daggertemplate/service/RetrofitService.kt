package com.katrinrudisch.daggertemplate.service

import com.katrinrudisch.daggertemplate.model.Response
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers

interface RetrofitService {

    @GET("endpoint")
    @Headers("Accept: application/json")
    fun getResponse(): Observable<Response>
}