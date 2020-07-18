package com.example.sampleproject.main.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.sampleproject.livedata.LiveDataFactory

class MainViewModelFactory(private val liveDataFactory: LiveDataFactory) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModelImpl(liveDataFactory) as T
    }
}