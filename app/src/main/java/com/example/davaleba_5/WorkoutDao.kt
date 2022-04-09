package com.example.davaleba_5

import androidx.room.*

@Dao
interface WorkoutDao {
    @Query("SELECT * FROM works")
    fun getAllWorks(): List<Work>?
    @Query("SELECT SUM(RUN_DISTANCE) AS run_distance FROM works")
    fun getSum(): Float?
    @Query("SELECT AVG(RUN_DISTANCE) AS run_distance FROM works")
    fun getAverage(): Float?
    @Query("SELECT AVG(RUN_SWIMMING) as run_swimming FROM works")
    fun getAverageRunSwimming(): Float?
    @Query("SELECT AVG(RUN_CALORIES) AS run_calories FROM works")
    fun getAverageRunCalories(): Float?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg works : Work)
    @Delete
    fun delete(work: Work)
    @Query("DELETE FROM WORKS")
    fun deleteAll()
}