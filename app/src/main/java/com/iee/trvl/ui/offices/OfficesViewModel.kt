package com.iee.trvl.ui.offices

import android.app.Application
import android.text.TextUtils
import android.widget.Toast
import androidx.lifecycle.*
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import com.iee.trvl.R
import com.iee.trvl.entities.Departments
import com.iee.trvl.entities.DepartmentsRepository
import com.iee.trvl.entities.TrvlDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OfficesViewModel() : ViewModel() {





    private val _text = MutableLiveData<String>().apply {
        value = "This is offices Fragment"
    }
    val text: LiveData<String> = _text











}