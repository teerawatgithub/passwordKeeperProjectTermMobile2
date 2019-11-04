package com.example.passwordkeeper


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.passwordkeeper.databinding.FragmentAddPasswordBinding

/**
 * A simple [Fragment] subclass.
 */
class AddPasswordFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAddPasswordBinding>(inflater,
            R.layout.fragment_add_password,container,false)
        binding.submitButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_addPasswordFragment_to_vaultFragment)
        }
        return binding.root
    }


}
