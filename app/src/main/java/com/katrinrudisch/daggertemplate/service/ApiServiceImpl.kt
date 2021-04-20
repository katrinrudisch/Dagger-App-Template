package com.katrinrudisch.daggertemplate.service

import com.katrinrudisch.daggertemplate.model.Response
import io.reactivex.Observable
import timber.log.Timber
import javax.inject.Inject

class ApiServiceImpl @Inject constructor(
    private val retrofitService: RetrofitService
) : ApiService {

    override fun getResponse(): Observable<Response> {
        return retrofitService.getResponse()
    }
}