package com.camcorderemulator.ui.gallerry

import android.view.View
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.gbhomework.camcorderemulator.R
import com.squareup.picasso.Picasso
import java.io.File

class GalleryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val imageView = itemView.findViewById<ImageView>(R.id.itemPicture)

    fun bind(path: String) {
        val imgFile = File(path)

        if (imgFile.exists()) {
            Picasso.get()
                .load(imgFile)
                .resize(50, 50)
                .centerCrop()
                .into(imageView)

            imageView.setOnClickListener {
                val navigationAction = GalleryFragmentDirections.actionGalleryToDetailFragment(path)
                imageView.findNavController().navigate(navigationAction)
            }
        }
    }
}