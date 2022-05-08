package com.iee.trvl.ui.packages

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PackagesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is travel packages Fragment"
    }
    val text: LiveData<String> = _text
}