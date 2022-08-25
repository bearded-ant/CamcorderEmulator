package com.camcorderemulator.ui.pictures

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class GalleryAdapter(private val resources: List<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            0
        } else {
            1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var viewHolder: RecyclerView.ViewHolder
        var itemLayoutView: View
        val view =
            LayoutInflater.from(parent.context).inflate(com.gbhomework.camcorderemulator.R.layout.item_picture, parent, false) //default
        viewHolder = GalleryHolder(view)
        when (viewType) {
            0 -> {
                itemLayoutView = LayoutInflater.from(parent.context)
                    .inflate(com.gbhomework.camcorderemulator.R.layout.item_camera, parent, false)
                viewHolder = CameraHolder(itemLayoutView)
            }
            1 -> {
                itemLayoutView = LayoutInflater.from(parent.context)
                    .inflate(com.gbhomework.camcorderemulator.R.layout.item_picture, parent, false)
                viewHolder = GalleryHolder(itemLayoutView)
            }
        }
        return viewHolder
    }

    override fun getItemCount(): Int = resources.size
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            0 -> {
                holder as CameraHolder
                holder.bind(resources[position])
            }
            1 ->{
                holder as GalleryHolder
                holder.bind(resources[position])
            }
        }
    }
}