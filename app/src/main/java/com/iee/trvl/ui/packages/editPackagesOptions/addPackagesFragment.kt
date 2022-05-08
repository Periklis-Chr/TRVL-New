package com.iee.trvl.ui.packages.editPackagesOptions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.iee.trvl.databinding.FragmentAddPackagesBinding


class AddPackagesFragment : Fragment() {
    private var _binding: FragmentAddPackagesBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentAddPackagesBinding.inflate(inflater, container, false)
        val root: View = binding.root


//        return inflater.inflate(R.layout.fragment_add_packages, container, false)
        return root

    }


}