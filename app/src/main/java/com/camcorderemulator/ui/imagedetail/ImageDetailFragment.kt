package com.camcorderemulator.ui.imagedetail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ScaleGestureDetector
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gbhomework.camcorderemulator.R
import com.gbhomework.camcorderemulator.databinding.FragmentImageDetailBinding
import com.squareup.picasso.Picasso

class ImageDetailFragment : Fragment(){

    private var _binding: FragmentImageDetailBinding? = null
    private val binding
        get() = _binding!!

    private var scalingDetector: ScaleGestureDetector? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentImageDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        scalingDetector = ScaleGestureDetector(requireContext(), ScalingListener(1f, binding.frImageDetailPicture))
        binding.frImageDetailPicture.setOnTouchListener { _, motionEvent ->
            scalingDetector!!.onTouchEvent(motionEvent)
            true
        }

//        val imageFile = File("string")
//        if (imageFile.exists())
        Picasso.get().load(R.drawable.svis123asdslv2).into(binding.frImageDetailPicture)
    }
}