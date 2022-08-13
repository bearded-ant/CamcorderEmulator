package com.camcorderemulator.domain

interface ImageRepo {
    fun getImages(): List<String>
}