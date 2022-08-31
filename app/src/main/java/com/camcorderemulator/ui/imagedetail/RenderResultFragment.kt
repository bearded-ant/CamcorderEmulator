package com.camcorderemulator.ui.imagedetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.gbhomework.camcorderemulator.databinding.FragmentRenderResultBinding

class RenderResultFragment : Fragment() {
    private var _binding: FragmentRenderResultBinding? = null
    private val binding
        get() = _binding!!

    private var pathArgument: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRenderResultBinding.inflate(layoutInflater)
        pathArgument = RenderResultFragmentArgs.fromBundle(requireArguments()).imgPath
        Toast.makeText(requireContext(), "render", Toast.LENGTH_SHORT).show()
        initViewPager()
        return binding.root
    }

    private fun initViewPager() {
        val viewPager = binding.frRenderResultPager
        val adapter = RenderResultAdapter(pathArgument!!)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = adapter
    }
}