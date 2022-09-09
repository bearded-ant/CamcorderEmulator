package com.camcorderemulator.ui.imagedetail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.camcorderemulator.domain.Lens
import com.gbhomework.camcorderemulator.R
import com.google.android.material.textview.MaterialTextView

class FocalOptionAdapter(private val items: List<Lens>) :
    RecyclerView.Adapter<FocalOptionAdapter.FocalOptionHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FocalOptionHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_focal_option, parent, false)
        return FocalOptionHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: FocalOptionHolder, position: Int) =
        holder.bind(items[position])

    inner class FocalOptionHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val img = itemView.findViewById<AppCompatImageView>(R.id.itemFocalOptionImage)
        private val desk = itemView.findViewById<MaterialTextView>(R.id.itemFocalOptionDescription)

        fun bind(lens: Lens) {
            img.setImageResource(lens.imgSrc)
            val description = "${lens.angleX}/${lens.angleY}"
            desk.text = description
        }
    }
}
