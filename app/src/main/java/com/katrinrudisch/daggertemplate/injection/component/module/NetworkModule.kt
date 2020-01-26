package com.katrinrudisch.daggertemplate.injection.component.module

import com.google.gson.Gson
import com.katrinrudisch.daggertemplate.service.ApiService
import com.katrinrudisch.daggertemplate.service.ApiServiceImpl
import com.katrinrudisch.daggertemplate.service.RetrofitService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    companion object {
        const val BASE_URL = "https://en.wikipedia.org"
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient
        .Builder()
        .build()

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()

    @Provides
    @Singleton
    fun provideRetrofitService(
        client: OkHttpClient,
        gson: Gson
    ): RetrofitService {
        val retrofit = Retrofit
            .Builder()
            .client(client)
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        return retrofit.create(RetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun provideApiService(retrofitService: RetrofitService): ApiService =
        ApiServiceImpl(retrofitService)

}