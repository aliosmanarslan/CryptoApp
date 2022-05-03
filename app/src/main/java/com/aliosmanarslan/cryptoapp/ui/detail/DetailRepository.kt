package com.aliosmanarslan.cryptoapp.ui.detail

import com.aliosmanarslan.cryptoapp.base.BaseRepository
import com.aliosmanarslan.cryptoapp.network.ApiFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by Ali Osman ARSLAN on 3.05.2022
 */

class DetailRepository @Inject constructor(private val apiFactory: ApiFactory): BaseRepository() {

    suspend fun getDetail(
        apiKey: String,
        symbol: String
    ) = safeApiRequest {
        apiFactory.getDetail(apiKey, symbol)
    }
}