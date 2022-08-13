package com.camcorderemulator.domain

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "camdimensions")
data class Dimensions(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "cam_id")
    val camId: Int?,
    @ColumnInfo(name = "cam_dimens")
    val dimension: String?,
    @ColumnInfo(name = "aspect_ratio")
    val aspectRatio: String?
) : Parcelable