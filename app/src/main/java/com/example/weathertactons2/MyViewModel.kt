package com.example.weathertactons2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val myExperimentOrder = MutableLiveData<Array<Int>>()
}