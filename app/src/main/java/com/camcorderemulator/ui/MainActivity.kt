package com.camcorderemulator.ui

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.camcorderemulator.ui.camcorders.CamcordersListFragment
import com.camcorderemulator.ui.pictures.GalleryFragment
import com.camcorderemulator.utils.PermissionUtils
import com.gbhomework.camcorderemulator.R


private const val PERMISSION_STORAGE = 101

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (PermissionUtils.hasPermissions(applicationContext))
            PermissionUtils.requestPermissions(this, PERMISSION_STORAGE)


        supportFragmentManager
            .beginTransaction()
//            .replace(R.id.fragment_container, CamcordersListFragment())
            .replace(R.id.fragment_container, GalleryFragment())
            .commit()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String?>,
        grantResults: IntArray
    ) {
        if (requestCode == PERMISSION_STORAGE) {
            val tvPermission = findViewById<TextView>(R.id.perm)
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                tvPermission.text = "Разрешение получено"
            } else {
                tvPermission.text = "Разрешение не предоставлено"
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}