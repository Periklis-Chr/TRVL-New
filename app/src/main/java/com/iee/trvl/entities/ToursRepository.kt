package com.iee.trvl.entities

import androidx.lifecycle.LiveData

class ToursRepository(private val toursDao: ToursDao) {


    val readToursData: LiveData<List<Tours>> = toursDao.readTours()

    fun addTours(tours: Tours){
        toursDao.addTours(tours)
    }

}