package com.camcorderemulator.data

import com.camcorderemulator.domain.Camcorder
import com.camcorderemulator.domain.CamcordersRepo

class MockCamcordersRepoImpl : CamcordersRepo {

    private val camcorders: ArrayList<Camcorder> = arrayListOf()
    override fun getAllData(): List<Camcorder> {
        camcorders.add(Camcorder(0, "Zoi Gothi Hamam", "+7 987 654 32 10", "", "100"))
        camcorders.add(Camcorder(0, "Hoi", "+7 987 654 32 11", "", "20"))
        camcorders.add(Camcorder(0, "Joi", "+7 987 654 32 12", "", "30"))
        camcorders.add(Camcorder(0, "Koi", "+7 987 654 32 13", "", "40"))
        camcorders.add(Camcorder(0, "Loi", "+7 987 654 32 14", "", "50"))
        camcorders.add(Camcorder(0, "Xoi", "+7 987 654 32 15", "", "60"))
        camcorders.add(Camcorder(0, "Coi", "+7 987 654 32 16", "", "70"))
        return camcorders
    }
}