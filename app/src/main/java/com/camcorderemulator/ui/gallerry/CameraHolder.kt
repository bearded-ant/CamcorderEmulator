package com.camcorderemulator.ui.pictures

import android.hardware.Camera
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gbhomework.camcorderemulator.R
import java.io.IOException

class CameraHolder(itemView: View) : RecyclerView.ViewHolder(itemView), SurfaceHolder.Callback, View.OnClickListener, Camera.PictureCallback, Camera.PreviewCallback, Camera.AutoFocusCallback {
    private val preview = itemView.findViewById<SurfaceView>(R.id.surfaceView)
    private lateinit var camera: Camera

    fun bind(path: String) {
        val surfaceHolder = preview!!.holder
        surfaceHolder.addCallback(this)
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS)
        try {
            camera = Camera.open()
            Log.d("что-то с камерой", "getCameraInstance()open:: $camera")
        } catch (e: java.lang.Exception) {
        }
    }

    override fun surfaceCreated(holder: SurfaceHolder) {
        try {
            camera.setPreviewDisplay(holder)
            camera.setPreviewCallback(this)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        val previewSize: Camera.Size = camera.parameters.previewSize
        val aspect: Float = previewSize.width.toFloat() / previewSize.height
        val previewSurfaceWidth = preview!!.width
        val previewSurfaceHeight = preview.height
        val lp: ViewGroup.LayoutParams = preview.layoutParams
        camera.setDisplayOrientation(0)
            lp.width = previewSurfaceWidth
            lp.height = previewSurfaceHeight
            preview.layoutParams = lp
            camera.startPreview()
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {

    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {

    }

    override fun onClick(v: View?) {

    }

    override fun onPictureTaken(data: ByteArray?, camera: Camera?) {

    }

    override fun onPreviewFrame(data: ByteArray?, camera: Camera?) {

    }

    override fun onAutoFocus(success: Boolean, camera: Camera?) {
    }
}