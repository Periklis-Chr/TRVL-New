package com.iee.trvl.ui.tours.editToursOptions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.iee.trvl.databinding.FragmentAddToursBinding


class AddToursFragment : Fragment() {


    private var _binding: FragmentAddToursBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        _binding = FragmentAddToursBinding.inflate(inflater, container, false)
        val root: View = binding.root




//        return inflater.inflate(R.layout.fragment_add_tours, container, false)
        return root
    }


}