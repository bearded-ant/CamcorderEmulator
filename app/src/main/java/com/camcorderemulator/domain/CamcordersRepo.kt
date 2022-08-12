package com.camcorderemulator.domain

interface CamcordersRepo {
    fun getAllData(): List<Camcorder>
}