package com.maximmesh.newsapp.data.api

import com.maximmesh.newsapp.utils.Constants.Companion.API_KEY
import com.maximmesh.newsapp.utils.Constants.Companion.FIRST_END_POINT
import com.maximmesh.newsapp.utils.Constants.Companion.SECOND_END_POINT
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET(FIRST_END_POINT)
    suspend fun getEveryThing(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    )

    @GET(SECOND_END_POINT)
    suspend fun getHeadLines(
        @Query("country") countryCode: String = "ru",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    )
}