package com.iee.trvl.ui.tours

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToursViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is tours Fragment"
    }
    val text: LiveData<String> = _text
}