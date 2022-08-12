package com.camcorderemulator.ui.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.camcorderemulator.domain.Camcorder
import com.gbhomework.camcorderemulator.R

class CamcorderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name = itemView.findViewById<TextView>(R.id.cameraName)

    fun bind(camera: Camcorder) {
        name.text = camera.name
    }
}