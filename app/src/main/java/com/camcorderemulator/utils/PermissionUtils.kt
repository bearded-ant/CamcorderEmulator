package com.camcorderemulator.utils

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.Settings
import android.util.Log
import androidx.activity.result.ActivityResultLauncher
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.camcorderemulator.ui.MainActivity


object PermissionUtils {

    @RequiresApi(Build.VERSION_CODES.Q)
    fun requestPermission(activity: MainActivity, arl: ActivityResultLauncher<String>) {
        when {
            this.let {
                ContextCompat.checkSelfPermission(
                    activity,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
            } == PackageManager.PERMISSION_GRANTED -> {
                Log.d("разрешение", "получили")
            }
            this.let {
                ActivityCompat.shouldShowRequestPermissionRationale(
                    activity,
                    Manifest.permission.CAMERA
                )
            } -> {
                arl.launch(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
            }
            else -> {
                arl.launch(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
            }
        }
    }
}