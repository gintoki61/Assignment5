package com.example.davaleba_5

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "WORKS")
data class Work(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "RUN_ID")
    val id: Int,
    @ColumnInfo(name = "RUN_DISTANCE")
    val distance: Int?,
    @ColumnInfo(name = "RUN_SWIMMING")
    val swimming: Int?,
    @ColumnInfo(name = "RUN_CALORIES")
    val calories: Int?

)