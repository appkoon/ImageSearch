package com.seongheonson.kakakoimagesearch.api

import com.seongheonson.kakakoimagesearch.vo.ImageSearch
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface KakaoService {

    @GET("search/image")
    fun searchImages(@Query("query") query: String, @Query("page") page: Int, @Query("size") size: Int): Single<Response<ImageSearch>>

}