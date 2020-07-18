package com.example.sampleproject.main.impl

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.example.sampleproject.livedata.LiveDataFactory
import com.example.sampleproject.main.MainViewModel

class MainViewModelImpl(
    liveDataFactory: LiveDataFactory
) : ViewModel(), MainViewModel {

    @VisibleForTesting
    val textLiveData: MutableLiveData<String> = liveDataFactory.getMutableLiveData()

    init {
        helloWorldText()
    }

    override fun getHelloWorldTextLiveData(): LiveData<String> {
        return textLiveData.map { it.toUpperCase() }
    }

    override fun helloWorldText() {
        textLiveData.value = "Hello World Ravi Tej"
    }
}