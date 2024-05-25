package com.wanhui.androidmodular

import androidx.lifecycle.ViewModel
import com.wanhui.androidmodular.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by WanHui on 2024/5/25
 */
@HiltViewModel
class MainViewModel @Inject constructor(private val repository: MainRepository): ViewModel() {
    fun getData(): String {
        return repository.getData()
    }
}