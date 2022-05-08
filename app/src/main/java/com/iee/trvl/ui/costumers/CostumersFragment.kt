package com.iee.trvl.ui.costumers


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.iee.trvl.R
import com.iee.trvl.databinding.FragmentCostumersBinding

class CostumersFragment : Fragment() {

    private var _binding: FragmentCostumersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(CostumersViewModel::class.java)

        _binding = FragmentCostumersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCostumers
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        binding.floatingActionButtonAddCostumers.setOnClickListener {
            findNavController().navigate(R.id.action_nav_costumers_to_addCostumersFragment)
        }







        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}