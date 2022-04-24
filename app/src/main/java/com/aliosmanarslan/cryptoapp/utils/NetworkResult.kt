package com.aliosmanarslan.cryptoapp.utils

/**
 * Created by Ali Osman ARSLAN on 25.04.2022
 */
sealed class NetworkResult<T>(
    val data: T? = null,
    val message: String? = null,
    val networkError: Boolean = false
) {
    class Success<T>(data: T): NetworkResult<T>(data)
    class Error<T>(networkError: Boolean, message: String?): NetworkResult<T>(data = null, message = message, networkError = networkError)
}