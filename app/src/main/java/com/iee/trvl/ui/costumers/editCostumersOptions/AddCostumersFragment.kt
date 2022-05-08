package com.iee.trvl.ui.costumers.editCostumersOptions

import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.iee.trvl.R
import com.iee.trvl.databinding.FragmentAddCostumersBinding
import com.iee.trvl.databinding.FragmentAddOfficesBinding

class AddCostumersFragment : Fragment() {


    private var _binding: FragmentAddCostumersBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_add_costumers, container, false)
        _binding = FragmentAddCostumersBinding.inflate(inflater, container, false)
        val root: View = binding.root


return root
    }
}