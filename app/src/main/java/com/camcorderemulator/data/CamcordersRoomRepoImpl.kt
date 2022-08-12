package com.camcorderemulator.data

import com.camcorderemulator.App
import com.camcorderemulator.domain.Camcorder
import com.camcorderemulator.domain.CamcordersRepo

class CamcordersRoomRepoImpl : CamcordersRepo {
    override fun getAllData(): List<Camcorder> {

        var camcordersList = mutableListOf<Camcorder>()

        try {
            Thread {
                camcordersList.addAll(App.database.camcordersDao().getAll().toMutableList())

            }.start()
        } catch (t: Throwable) {
            error(t.message.toString())
        }

        return camcordersList
    }
}