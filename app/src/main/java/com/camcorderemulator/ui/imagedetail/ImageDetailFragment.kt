package com.camcorderemulator.ui.imagedetail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ScaleGestureDetector
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.drew.imaging.ImageMetadataReader
import com.gbhomework.camcorderemulator.databinding.FragmentImageDetailBinding
import com.squareup.picasso.Picasso
import java.io.File

class ImageDetailFragment : Fragment() {

    private var _binding: FragmentImageDetailBinding? = null
    private val binding
        get() = _binding!!

    private var scalingDetector: ScaleGestureDetector? = null
    private var pathArgument: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentImageDetailBinding.inflate(layoutInflater)
        pathArgument = ImageDetailFragmentArgs.fromBundle(requireArguments()).imgPath
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageFile = File(pathArgument)
        if (imageFile.exists()) {
            Picasso.get().load(imageFile).into(binding.frImageDetailPicture)
            val metadata = ImageMetadataReader.readMetadata(imageFile)

            for (meta in metadata.directories) {
                for (tag in meta.tags) {
                    Log.d("myLogs", "${tag.tagType} ${tag.tagName} ${tag.description}")
                    binding.frImageDetailMetadata.text =
                        "${tag.tagType} ${tag.tagName} ${tag.description}"
                }
            }

        }
    }
}