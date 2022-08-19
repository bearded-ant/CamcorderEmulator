package com.camcorderemulator.ui.imagedetail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ScaleGestureDetector
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        scalingDetector = ScaleGestureDetector(
            requireContext(),
            ScalingListener(1f, binding.frImageDetailPicture)
        )
        binding.frImageDetailPicture.setOnTouchListener { _, motionEvent ->
            scalingDetector!!.onTouchEvent(motionEvent)
            true
        }

        val imageFile = File(pathArgument)
        if (imageFile.exists())
            Picasso.get().load(imageFile).into(binding.frImageDetailPicture)
    }
}