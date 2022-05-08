package com.iee.trvl.entities

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface DepartmentsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addDepartment(department: Departments)

    @Delete
    fun deleteDepartment(department: Departments)


    @Update
    fun updateDepartments(department: Departments)

    @Query("SELECT * FROM Departments_table")
    fun readDepartments(): LiveData<List<Departments>>
}