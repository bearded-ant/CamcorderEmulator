package com.camcorderemulator.domain

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "camcorders")
data class Camcorder(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "vendorCode")
    val vendorCode: String?,
    @ColumnInfo(name = "name")
    val name: String?,
    @ColumnInfo(name = "cost")
    val cost: String?,
    @ColumnInfo(name = "viewing_angle")
    val angle: String?
): Parcelable