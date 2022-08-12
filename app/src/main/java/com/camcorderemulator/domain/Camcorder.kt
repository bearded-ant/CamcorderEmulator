package com.camcorderemulator.domain

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "camcorders")
data class Camcorder(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val vendorCode: String,
    val cost: String,
    val angle: String
): Parcelable