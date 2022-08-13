package com.camcorderemulator.domain

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Camcorder::class, Dimensions::class], version = 1, exportSchema = false)
abstract class CamcordersBase : RoomDatabase() {
    abstract fun camcordersDao(): CamcordersDao
}