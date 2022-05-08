package com.iee.trvl.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time


@Entity(tableName = "Tours_table")
data class Tours (
    @PrimaryKey(autoGenerate = true)
    val Tid: Int,
    val City: String,
    val Country: String,
    val Duration: Time,
    val Type:String
)