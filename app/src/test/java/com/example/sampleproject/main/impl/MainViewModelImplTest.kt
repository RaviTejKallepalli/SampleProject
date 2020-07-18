package com.example.sampleproject.main.impl

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.sampleproject.getOrAwaitValue
import com.example.sampleproject.livedata.impl.LiveDataFactoryImpl
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainViewModelImplTest {

    @get:Rule
    var instantTaskExecutor = InstantTaskExecutorRule()

    private val liveDataFactory = LiveDataFactoryImpl()

    private lateinit var viewModel: MainViewModelImpl

    @Before
    fun setup() {
        viewModel = MainViewModelImpl(liveDataFactory)
    }

    @Test
    fun getHelloWorldTextLiveData() {
        viewModel.helloWorldText()

        val value = viewModel.getHelloWorldTextLiveData().getOrAwaitValue()

        assertEquals(
            "Hello World Ravi Tej".toUpperCase(),
            value
        )
    }

    @Test
    fun helloWorldText() {
        viewModel.helloWorldText()

        assertEquals("Hello World Ravi Tej", viewModel.textLiveData.value)
    }
}