package com.iee.trvl.entities

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities =  [Departments::class,Tours::class,Packages::class],version = 1,exportSchema = false)
abstract class TrvlDatabase:RoomDatabase() {


    abstract fun departmentsDao(): DepartmentsDao
    abstract fun toursDao(): ToursDao
    abstract fun packagesDao(): PackagesDao


    companion object {
        @Volatile
        private var INSTANCE: TrvlDatabase? = null

        fun getDatabase(context: Context): TrvlDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TrvlDatabase::class.java,
                    "database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }


    }






}