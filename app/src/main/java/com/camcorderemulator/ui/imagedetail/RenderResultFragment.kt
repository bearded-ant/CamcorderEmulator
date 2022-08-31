package com.camcorderemulator.ui.imagedetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.gbhomework.camcorderemulator.databinding.FragmentRenderResultBinding

class RenderResultFragment : Fragment() {
    private var _binding: FragmentRenderResultBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRenderResultBinding.inflate(layoutInflater)
        initViewPager()
        return binding.root
    }

    private fun initViewPager() {
        val viewPager = binding.frRenderResultPager
        val adapter = RenderResultAdapter()
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = adapter
    }
}