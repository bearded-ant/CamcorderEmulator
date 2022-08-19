package com.camcorderemulator.ui

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.camcorderemulator.ui.gallerry.GalleryFragment
import com.camcorderemulator.utils.PermissionUtils
import com.gbhomework.camcorderemulator.R


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    private val requestPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                Log.d("разрешение", "получено")
            } else {

            }
        }
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PermissionUtils.requestPermission(this, requestPermissionLauncher)


        supportFragmentManager
            .beginTransaction()
//            .replace(R.id.fragment_container, CamcordersListFragment())
            .replace(R.id.fragment_container, GalleryFragment())
            .commit()
    }
}