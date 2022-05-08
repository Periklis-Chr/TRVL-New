package com.iee.trvl.ui.packages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.iee.trvl.R
import com.iee.trvl.databinding.FragmentPackagesBinding

class PackagesFragment : Fragment() {

    private var _binding: FragmentPackagesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val packagesViewModel =
            ViewModelProvider(this).get(PackagesViewModel::class.java)

        _binding = FragmentPackagesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPackages
        packagesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }



        binding.floatingActionButtonaddPackages.setOnClickListener {
            findNavController().navigate(R.id.action_nav_packages_to_addPackagesFragment)
        }





        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}