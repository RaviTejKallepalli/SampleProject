package com.example.sampleproject.livedata

import androidx.lifecycle.MutableLiveData

interface LiveDataFactory {

    fun <T> getMutableLiveData(): MutableLiveData<T>
}