package com.camcorderemulator.ui.camcorders

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.camcorderemulator.data.CamcordersRoomRepoImpl
import com.camcorderemulator.ui.camcorders.CamcordersAdapter
import com.gbhomework.camcorderemulator.databinding.FragmentCamcordersListBinding

class CamcordersListFragment : Fragment() {

    private var _binding: FragmentCamcordersListBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCamcordersListBinding.inflate(layoutInflater)
        Toast.makeText(requireContext(), "TOST", Toast.LENGTH_SHORT).show()
        initRecycler()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun initRecycler() {
        val camcorders = CamcordersRoomRepoImpl().getAllData()
            Log.d("что там", "$camcorders")
        val recycler = binding.frCamcordersListRecycler
        recycler.layoutManager = LinearLayoutManager(requireContext())

        val adapter = CamcordersAdapter(camcorders)
        recycler.adapter = adapter
    }
}