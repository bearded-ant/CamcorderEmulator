package com.camcorderemulator.ui.pictures

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gbhomework.camcorderemulator.R

class GalleryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name = itemView.findViewById<TextView>(R.id.itemPicture)

    fun bind(path: String) {
        name.text = path.toString()
    }
}