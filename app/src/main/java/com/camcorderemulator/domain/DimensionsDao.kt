package com.camcorderemulator.domain

import androidx.room.Dao
import androidx.room.Query

@Dao
interface DimensionsDao {
    @Query("select * from camdimensions")
    fun getAll(): List<Dimensions>

    @Query("select * from camdimensions cd where cd.cam_id = :camId")
    fun getCamcorderDimens(camId: Int) : List<Dimensions>
}