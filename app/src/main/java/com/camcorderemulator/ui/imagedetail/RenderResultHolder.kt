package com.camcorderemulator.ui.imagedetail

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.gbhomework.camcorderemulator.R
import com.github.chrisbanes.photoview.PhotoView
import com.squareup.picasso.Picasso
import java.io.File

class RenderResultHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val imageItem = itemView.findViewById<PhotoView>(R.id.itemRenderResultImage)

    fun getRenderImage(path: Int, width: Int, height: Int) {
//        val imgFile = File(path)
//
//        if (imgFile.exists()) {
        Picasso.get()
//                .load(imgFile)
            .load(path)
            .resize(width, height)
            .centerCrop()
            .into(imageItem)
    }
//    }
}