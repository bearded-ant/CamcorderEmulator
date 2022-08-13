package com.camcorderemulator

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.camcorderemulator.domain.CamcordersBase

class App:Application() {
    companion object {
        lateinit var instance: App
            private set
        lateinit var database: CamcordersBase
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(this, CamcordersBase::class.java, "camcorders")
            .createFromAsset("pre_camcorders")
            .build()
    }
}

val Context.app: App
    get() = applicationContext as App