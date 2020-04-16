package com.fortatic.apps.nestednavigationexample.one

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModelOne : ViewModel() {

    private val _item = MutableLiveData<String>()
    val item : LiveData<String>
        get() = _item

    init {
        Log.d("AFRC", "SharedViewModelOne has created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("AFRC", "SharedViewModelOne has removed!")
    }
}