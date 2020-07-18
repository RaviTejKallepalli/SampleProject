package com.example.sampleproject.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.sampleproject.R
import com.example.sampleproject.databinding.ActivityMainBinding
import com.example.sampleproject.livedata.impl.LiveDataFactoryImpl
import com.example.sampleproject.main.impl.MainViewModelFactory
import com.example.sampleproject.main.impl.MainViewModelImpl

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        viewModel = ViewModelProvider(this, MainViewModelFactory(LiveDataFactoryImpl()))
            .get(MainViewModelImpl::class.java)

        binding.viewModel = viewModel
    }
}