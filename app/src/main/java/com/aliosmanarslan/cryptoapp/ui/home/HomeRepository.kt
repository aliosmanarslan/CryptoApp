package com.aliosmanarslan.cryptoapp.ui.home

import com.aliosmanarslan.cryptoapp.base.BaseRepository
import com.aliosmanarslan.cryptoapp.network.ApiFactory
import javax.inject.Inject

/**
 * Created by Ali Osman ARSLAN on 28.04.2022
 */
class HomeRepository @Inject constructor(private val apiFactory: ApiFactory): BaseRepository(){
    suspend fun getData(
        apiKey: String,
        limit: String
    ) = safeApiRequest {
        apiFactory.getData(apiKey, limit)
    }
}