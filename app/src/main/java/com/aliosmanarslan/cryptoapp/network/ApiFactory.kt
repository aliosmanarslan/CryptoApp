package com.aliosmanarslan.cryptoapp.network

import com.aliosmanarslan.cryptoapp.model.home.CryptoResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 * Created by Ali Osman ARSLAN on 25.04.2022
 */
interface ApiFactory {

    //https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?limit=10

    @GET("v1/cryptocurrency/listings/latest")
    suspend fun getData(
        @Header("X-CMC_PRO_API_KEY") apiKey: String,
        @Query("limit") limit: String
    ): CryptoResponse
}