package com.iee.trvl.entities

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ToursDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addTours(tour: Tours)

    @Delete
    fun deleteDTours(tour: Tours)

    @Update
    fun updateTours(tour: Tours)

    @Query("SELECT * FROM Tours_table")
    fun readTours(): LiveData<List<Tours>>



}