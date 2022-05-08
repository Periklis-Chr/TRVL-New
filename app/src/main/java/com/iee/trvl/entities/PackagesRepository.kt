package com.iee.trvl.entities

import androidx.lifecycle.LiveData

class PackagesRepository(private val packagesDao: PackagesDao) {

        //packages

    val readPackagesData: LiveData<List<Packages>> = packagesDao.readPackages()

    suspend fun addPackage(packages: Packages){
        packagesDao.addPackages(packages)
    }
}