package com.iee.trvl.entities

import androidx.lifecycle.LiveData

class DepartmentsRepository(private val departmentsDao:DepartmentsDao) {


    //departments

    val readDepartmentData: LiveData<List<Departments>> = departmentsDao.readDepartments()

    suspend fun addDepartment(departments: Departments){
        departmentsDao.addDepartment(departments)
    }



//
//


}