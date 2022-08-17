package com.camcorderemulator.ui

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.camcorderemulator.ui.camcorders.CamcordersListFragment
import com.camcorderemulator.ui.pictures.GalleryFragment
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


//        if (PermissionUtils.hasPermissions(applicationContext))
//            PermissionUtils.requestPermissions(this, PERMISSION_STORAGE)


        supportFragmentManager
            .beginTransaction()
//            .replace(R.id.fragment_container, CamcordersListFragment())
            .replace(R.id.fragment_container, GalleryFragment())
            .commit()
    }

//    override fun onRequestPermissionsResult(
//        requestCode: Int, permissions: Array<String?>,
//        grantResults: IntArray
//    ) {
//        if (requestCode == PERMISSION_STORAGE) {
//            val tvPermission = findViewById<TextView>(R.id.perm)
//            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                tvPermission.text = "Разрешение получено"
//            } else {
//                tvPermission.text = "Разрешение не предоставлено"
//            }
//        }
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//    }

}