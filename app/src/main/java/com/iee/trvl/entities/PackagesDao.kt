package com.iee.trvl.entities

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PackagesDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addPackages(packages: Packages)

    @Delete
    fun deleteDPackages(packages: Packages)

    @Update
    fun updateTours(packages: Packages)

    @Query("SELECT * FROM Packages_table")
    fun readPackages(): LiveData<List<Packages>>




}