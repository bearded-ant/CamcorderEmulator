package com.camcorderemulator.data

import android.content.Context
import android.database.Cursor
import android.provider.MediaStore
import com.camcorderemulator.App
import com.camcorderemulator.domain.ImageRepo

class ImageRepoImpl(val context: Context) : ImageRepo {

    override fun getImages(): List<String> {
        val imagePaths = mutableListOf<String>()
        val isSDPresent = android.os.Environment.getExternalStorageState()
            .equals(android.os.Environment.MEDIA_MOUNTED)

        if (isSDPresent) {
            val columns: Array<String> =
                arrayOf(MediaStore.Images.Media.DATA, MediaStore.Images.Media._ID)
            val orderBy = MediaStore.Images.Media._ID
//            val cursor: Cursor? = App.instance.contentResolver.query(
            val cursor: Cursor? = context.contentResolver.query(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                columns,
                null,
                null,
                orderBy
            )
            if (cursor!!.count > 0) {
                for (i in 0 until cursor.count) {
                    cursor.moveToPosition(i)
                    val dataColumnIndex = cursor.getColumnIndex(MediaStore.Images.Media.DATA)
                    imagePaths.add(cursor.getString(dataColumnIndex))
                }
            }
            cursor.close()
        }
        return imagePaths
    }
}