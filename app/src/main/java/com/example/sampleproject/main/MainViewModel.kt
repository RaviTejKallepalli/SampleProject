package com.example.sampleproject.main

import androidx.lifecycle.LiveData

interface MainViewModel {

    fun helloWorldText()

    fun getHelloWorldTextLiveData() :LiveData<String>
}