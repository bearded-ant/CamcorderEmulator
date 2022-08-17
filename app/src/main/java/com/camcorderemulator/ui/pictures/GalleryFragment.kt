package com.camcorderemulator.ui.pictures

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.camcorderemulator.data.ImageRepoImpl
import com.gbhomework.camcorderemulator.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(layoutInflater)
        Toast.makeText(requireContext(), "галерея", Toast.LENGTH_SHORT).show()

        initRecycler()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun initRecycler() {
        val images = ImageRepoImpl(requireContext()).getImages()
        Log.d("что  картинках", images.toString())
        val recycler = binding.frGalleryRecycler
        recycler.layoutManager = GridLayoutManager(requireContext(),2)

        val adapter = GalleryAdapter(images)
        recycler.adapter = adapter
    }
}