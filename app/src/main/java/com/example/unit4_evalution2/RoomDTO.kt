package com.example.unit4_evalution2

import androidx.room.*

@Dao
interface RoomDTO {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insert(routainEntity: RoutainEntity)
    @Query("SELECT * FROM Evalution2")
    fun getAll(): List<RoutainEntity>
    @Update
    fun updateTask(routainEntity: RoutainEntity)
    @Delete
    fun deleteTask(routainEntity: RoutainEntity)


}