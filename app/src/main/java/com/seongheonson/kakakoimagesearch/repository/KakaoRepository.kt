package com.seongheonson.kakakoimagesearch.repository

import com.seongheonson.kakakoimagesearch.api.KakaoService
import com.seongheonson.kakakoimagesearch.vo.ImageSearch
import io.reactivex.Single
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class KakaoRepository @Inject constructor(private val kakaoService: KakaoService) {

    fun search(query: String, page: Int, size: Int) : Single<Response<ImageSearch>> =
            kakaoService.searchImages(query, page, size)

}