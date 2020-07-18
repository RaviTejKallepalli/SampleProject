package com.example.sampleproject.livedata.impl

import androidx.lifecycle.MutableLiveData
import com.example.sampleproject.livedata.LiveDataFactory

class LiveDataFactoryImpl : LiveDataFactory {

    override fun <T> getMutableLiveData(): MutableLiveData<T> {
        return MutableLiveData()
    }
}