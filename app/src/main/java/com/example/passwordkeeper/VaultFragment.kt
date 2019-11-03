package com.example.passwordkeeper


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.passwordkeeper.databinding.FragmentLoginBinding
import com.example.passwordkeeper.databinding.FragmentVaultBinding



class VaultFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentVaultBinding>(inflater,
            R.layout.fragment_vault,container,false)
        binding.securityButton.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_vaultFragment_to_securityFragment)
        }
        binding.settingButton.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_vaultFragment_to_settingFragment)
        }
        return binding.root
    }

}
