package com.camcorderemulator.ui.pictures

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gbhomework.camcorderemulator.R

class GalleryAdapter(private val resources: List<String>) :
    RecyclerView.Adapter<GalleryHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_picture, parent, false)
        return GalleryHolder(view)
    }

    override fun onBindViewHolder(holder: GalleryHolder, position: Int) {
        holder.bind(resources[position])
    }

    override fun getItemCount(): Int = resources.size
}