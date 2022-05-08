package com.iee.trvl.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time


@Entity(tableName = "Packages_table")
data class Packages (
    @PrimaryKey(autoGenerate = true)
    val Pid: Int,
    val Did: Int,
    val Tid: Int,
    val DepartureTime: Time,
    val Cost: Double
)