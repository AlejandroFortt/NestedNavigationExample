package com.fortatic.apps.nestednavigationexample.two

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModelTwo : ViewModel() {

    private val _item = MutableLiveData<String>()
    val item : LiveData<String>
        get() = _item

    init {
        Log.d("AFRC", "SharedViewModelTwo has created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("AFRC", "SharedViewModelTwo has removed!")
    }
}