package com.camcorderemulator.domain

import androidx.room.Dao
import androidx.room.Query

@Dao
interface CamcordersDao {
    @Query("select * from camcorders")
    fun getAll(): List<Camcorder>
}