package com.camcorderemulator.domain

interface LensRepo {
    fun getAllLenses(): List<Lens>
}