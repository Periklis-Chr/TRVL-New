package com.iee.trvl.ui.offices.editOfficesOptions

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.iee.trvl.databinding.FragmentAddOfficesBinding
import com.iee.trvl.entities.Departments
import com.iee.trvl.ui.offices.editOfficesOptions.AddOfficeViewModel
import com.iee.trvl.R
import com.iee.trvl.ui.offices.OfficesViewModel


class AddOfficesFragment : Fragment() {


    private var _binding: FragmentAddOfficesBinding? = null
    private val binding get() = _binding!!



private lateinit var ViewModel: AddOfficeViewModel




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentAddOfficesBinding.inflate(inflater, container, false)
        val root: View = binding.root


//        ViewModel = ViewModelProvider(this).get(OfficesViewModel::class.java)




        binding.addOfficeSubmitBtn.setOnClickListener{
              insertOfficeData()

        }


        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_add_offices, container, false)
return root
    }








    private fun insertOfficeData(){

       val code = binding.addofficeCode.text.toString()
       val name =binding.addofficeName.text.toString()
       val address=binding.addOfficeAdress.text.toString()

       if(inputCheck(code,name,address)){
          val office = Departments(Integer.parseInt(code),name,address)

//        ViewModel.addOffice(office)

         Toast.makeText(requireContext(),"Successfully added!",Toast.LENGTH_LONG).show()
          findNavController().navigate(R.id.nav_offices)

       }else{
         Toast.makeText(requireContext(),"Fill the input fields",Toast.LENGTH_LONG).show()
      }

  }

    private fun inputCheck(code:String,name:String,address:String):Boolean{
        return !(TextUtils.isEmpty(name) && TextUtils.isEmpty(address) && TextUtils.isEmpty(code))
  }

}