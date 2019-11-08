package com.example.passwordkeeper


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.passwordkeeper.databinding.FragmentAddPasswordBinding
import com.example.passwordkeeper.viewModel.AccoutViewModel
import kotlinx.android.synthetic.main.fragment_add_password.*

/**
 * A simple [Fragment] subclass.
 */
class AddPasswordFragment : Fragment() {
//    private lateinit var viewModel: AccoutViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAddPasswordBinding>(inflater,
            R.layout.fragment_add_password,container,false)
//        viewModel = ViewModelProviders.of(this).get(AccoutViewModel::class.java)
        binding.submitButton.setOnClickListener { view : View ->
//            viewModel.addAccout(binding.nameTextEdit.text.toString(), binding.usernameTextEdit.text.toString(), binding.passwordTextEdit.text.toString(), binding.noteTextEdit.text.toString())
//            Log.i("AddpasswordFragment", " testMask1")
            val name = binding.nameTextEdit.text.toString()
            val username = binding.usernameTextEdit.text.toString()
            view.findNavController().navigate(AddPasswordFragmentDirections.actionAddPasswordFragmentToVaultFragment(name, username))
        }



        return binding.root
    }


}
