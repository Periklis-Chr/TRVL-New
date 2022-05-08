package com.iee.trvl.ui.offices.editOfficesOptions

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.iee.trvl.entities.Departments
import com.iee.trvl.entities.DepartmentsRepository
import com.iee.trvl.entities.TrvlDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddOfficeViewModel (application: Application) : AndroidViewModel(application){


    private val readDepartmentData: LiveData<List<Departments>>

    private val repository: DepartmentsRepository




    init {
        val officeDao= TrvlDatabase.getDatabase(application).departmentsDao()
        repository = DepartmentsRepository(officeDao)
        readDepartmentData=repository.readDepartmentData
    }



    fun addOffice(departments: Departments){
        viewModelScope.launch(Dispatchers.IO){
            repository.addDepartment(departments)


        }

    }







}