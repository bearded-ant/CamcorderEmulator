package com.camcorderemulator.ui.imagedetail

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.transition.TransitionManager
import androidx.viewpager2.widget.ViewPager2
import com.camcorderemulator.data.MockCamcordersRepoImpl
import com.gbhomework.camcorderemulator.databinding.FragmentRenderResultBinding
import com.google.android.material.color.MaterialColors
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialFade

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
//        binding.frRenderResultFab.visibility = View.VISIBLE
        initViewPager()
        initClickListeners()
        initRecyclerFocalOption()
        binding.frRenderResultFab.post {
            val transition = MaterialFade().apply {
                duration = 2000
            }
            TransitionManager.beginDelayedTransition(binding.coordinator, transition)
            binding.frRenderResultFab.visibility = View.VISIBLE
        }

        return binding.root
    }

    private fun initRecyclerFocalOption() {
        val recycler = binding.frRenderResultOptionsRecycler
        recycler.layoutManager = LinearLayoutManager(requireContext())
        val adapter = FocalOptionAdapter(MockCamcordersRepoImpl().getAllData())

        recycler.adapter = adapter
    }

    private fun initViewPager() {
        val viewPager = binding.frRenderResultImageCarousel
        val adapter = RenderResultAdapter(pathArgument!!)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = adapter
    }

    private fun initClickListeners() {
        binding.frRenderResultFab.setOnClickListener {
            val transition = buildContainerTransformation()
            transition.startView = binding.frRenderResultFab
            transition.endView = binding.frRenderResultOptionCard
            transition.addTarget(binding.frRenderResultOptionCard)

            TransitionManager.beginDelayedTransition(binding.coordinator, transition)

            binding.frRenderResultOptionCard.visibility = View.VISIBLE
            binding.frRenderResultScrim.visibility = View.VISIBLE

            binding.frRenderResultFab.visibility = View.INVISIBLE
        }

        binding.frRenderResultScrim.setOnClickListener {

            val transition = buildContainerTransformation()
            transition.startView = binding.frRenderResultOptionCard
            transition.endView = binding.frRenderResultFab
            transition.addTarget(binding.frRenderResultFab)

            TransitionManager.beginDelayedTransition(binding.coordinator, transition)

            binding.frRenderResultOptionCard.visibility = View.INVISIBLE
            binding.frRenderResultScrim.visibility = View.INVISIBLE

            binding.frRenderResultFab.visibility = View.VISIBLE
        }

    }

    private fun buildContainerTransformation() =
        MaterialContainerTransform().apply {
            containerColor = MaterialColors.getColor(
                requireView(),
                com.google.android.material.R.attr.colorSecondary
            )
            scrimColor = Color.TRANSPARENT
            duration = 300
            interpolator = FastOutSlowInInterpolator()
            fadeMode = MaterialContainerTransform.FADE_MODE_IN
        }
}