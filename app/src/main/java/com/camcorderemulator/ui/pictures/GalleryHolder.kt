package com.camcorderemulator.ui.pictures

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.camcorderemulator.domain.Camcorder
import com.gbhomework.camcorderemulator.R

class GalleryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name = itemView.findViewById<TextView>(R.id.itemPicture)

    fun bind(imgId: Int) {
        name.text = imgId.toString()
    }
}