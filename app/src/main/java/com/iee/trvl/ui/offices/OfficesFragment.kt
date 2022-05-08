package com.iee.trvl.ui.offices

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.iee.trvl.R
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar
import com.iee.trvl.databinding.FragmentOfficesBinding
import com.iee.trvl.entities.Departments


class OfficesFragment : Fragment() {

    private var _binding: FragmentOfficesBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val officesViewModel =
            ViewModelProvider(this).get(OfficesViewModel::class.java)

        _binding = FragmentOfficesBinding.inflate(inflater, container, false)
        val root: View = binding.root



        val textView: TextView = binding.textOffices
        officesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it


        }



        binding.floatingActionButtonAddOffice.setOnClickListener {
            findNavController().navigate(R.id.action_nav_offices_to_addOffices)
        }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }







}