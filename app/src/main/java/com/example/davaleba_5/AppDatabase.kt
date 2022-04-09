package com.example.davaleba_5
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Work::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getWorkDao():WorkoutDao
}


