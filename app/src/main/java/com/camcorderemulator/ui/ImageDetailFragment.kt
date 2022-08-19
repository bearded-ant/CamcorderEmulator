package com.camcorderemulator.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gbhomework.camcorderemulator.databinding.FragmentImageDetailBinding

class ImageDetailFragment : Fragment() {

    private var _binding: FragmentImageDetailBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentImageDetailBinding.inflate(layoutInflater)

        return binding.root
    }
}