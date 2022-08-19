package com.camcorderemulator.ui.imagedetail

import android.view.ScaleGestureDetector
import android.view.View
import kotlin.math.max
import kotlin.math.min

class ScalingListener(scaleFactor: Float, private val itemView: View) :
    ScaleGestureDetector.SimpleOnScaleGestureListener() {

    private var mScaleFactor = scaleFactor

    override fun onScale(detector: ScaleGestureDetector?): Boolean {
        mScaleFactor *= detector!!.scaleFactor
        mScaleFactor = max(0.1f, min(mScaleFactor, 10.0f))

        itemView.scaleX = mScaleFactor
        itemView.scaleY = mScaleFactor
        return true
    }
}