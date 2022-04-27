package com.aliosmanarslan.cryptoapp.ui.home

import androidx.fragment.app.viewModels
import com.aliosmanarslan.cryptoapp.base.BaseFragment
import com.aliosmanarslan.cryptoapp.databinding.FragmentHomeBinding
import com.aliosmanarslan.cryptoapp.utils.Constants.API_KEY
import com.aliosmanarslan.cryptoapp.utils.Constants.LIMIT
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {
        viewModel.getData(API_KEY, LIMIT)
    }

    override fun initializeListeners() {

    }

    override fun obverseEvents() {

    }

}