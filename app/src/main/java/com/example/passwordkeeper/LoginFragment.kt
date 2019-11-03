package com.example.passwordkeeper


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.passwordkeeper.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
            R.layout.fragment_login,container,false)
        binding.loginButton.setOnClickListener{
            view : View -> Toast.makeText(context, "Login complete", Toast.LENGTH_LONG).show()
            view.findNavController().navigate(R.id.action_loginFragment_to_vaultFragment)
        }
        return binding.root
    }


}
