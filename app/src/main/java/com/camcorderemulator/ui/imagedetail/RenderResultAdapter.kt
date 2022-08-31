package com.camcorderemulator.ui.imagedetail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gbhomework.camcorderemulator.R

class RenderResultAdapter : RecyclerView.Adapter<RenderResultHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RenderResultHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_rendered_image, parent, false)
        return RenderResultHolder(itemView)
    }

    override fun onBindViewHolder(holder: RenderResultHolder, position: Int) {
        holder.getRenderImage(R.drawable.hdr, 800, 600)
    }

    override fun getItemCount(): Int = 1
}