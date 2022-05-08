package com.iee.trvl.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="Departments_table")
data class Departments(
    @PrimaryKey()
    val Did: Int,
    val Name: String,
    val Address: String
)