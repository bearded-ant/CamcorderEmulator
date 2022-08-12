package com.camcorderemulator.ui.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.camcorderemulator.domain.Camcorder
import com.gbhomework.camcorderemulator.R

class CamcordersAdapter(private val camcorders: List<Camcorder>) :
    RecyclerView.Adapter<CamcorderHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CamcorderHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_camcorder, parent, false)
        return CamcorderHolder(view)
    }

    override fun onBindViewHolder(holder: CamcorderHolder, position: Int) {
        holder.bind(camcorders[position])
    }

    override fun getItemCount(): Int = camcorders.size
}