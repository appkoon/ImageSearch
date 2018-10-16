package com.seongheonson.kakakoimagesearch.api


interface ApiResponse<T> {
    fun onSuccess(response: T)
    fun onError(throwable: Throwable)
    fun onServerError(errorMessage: String)
}