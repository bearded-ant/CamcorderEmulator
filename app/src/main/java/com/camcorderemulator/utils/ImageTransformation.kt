package com.camcorderemulator.utils

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.util.Log
import androidx.core.graphics.scale
import com.squareup.picasso.Transformation

class ImageTransformation(val width: Int, val height: Int) : Transformation {
    override fun transform(source: Bitmap?): Bitmap {
        val sourceImage = source!!

        val bigImage = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)
        val canvas = Canvas(bigImage)
        val paint = Paint()
        val offsetWidth = (width-sourceImage.width)/2.toFloat()
        val offsetHeight = (height-sourceImage.height)/2.toFloat()

        paint.color = 0
        canvas.drawBitmap(bigImage,0F,0F, paint)
        Log.d("myLogs", "transform: ${source.width}, $width,  $offsetWidth")
        canvas.drawBitmap(sourceImage,offsetWidth,offsetHeight,null)

        sourceImage.recycle()
        return  bigImage.scale(1920, 1080)
    }

    override fun key(): String  = "6080*3085"
}