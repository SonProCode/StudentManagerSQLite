package com.example.studentmanager_v2

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Student (
    @PrimaryKey(autoGenerate = true)
    val _id: Int = 0,
    val hoten: String,
    val mssv: String
)