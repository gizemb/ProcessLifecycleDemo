package com.gizmiks.processlifecycledemo.activity.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// https://developer.android.com/topic/libraries/architecture/viewmodel-savedstate

class MyViewModel: ViewModel() {

    private val _numberLiveData = MutableLiveData<Int>().apply { value = 5 }
    val numberLiveData : LiveData<Int> = _numberLiveData

    fun incrementNumber() {
        _numberLiveData.postValue(_numberLiveData.value!! + 1)
    }
}