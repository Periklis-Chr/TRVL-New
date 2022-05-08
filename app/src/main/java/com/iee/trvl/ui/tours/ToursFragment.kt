package com.iee.trvl.ui.tours

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.iee.trvl.R
import com.iee.trvl.databinding.FragmentToursBinding

class ToursFragment : Fragment() {

    private var _binding: FragmentToursBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val toursViewModel =
            ViewModelProvider(this).get(ToursViewModel::class.java)

        _binding = FragmentToursBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTours
        toursViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        binding.floatingActionButtonaddTours.setOnClickListener {
            findNavController().navigate(R.id.action_nav_tours_to_addToursFragment)
        }






        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}