package com.aliosmanarslan.cryptoapp.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.aliosmanarslan.cryptoapp.base.BaseFragment
import com.aliosmanarslan.cryptoapp.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {
        TODO("Not yet implemented")
    }

    override fun initializeListeners() {
        TODO("Not yet implemented")
    }

    override fun obverseEvents() {
        TODO("Not yet implemented")
    }

}