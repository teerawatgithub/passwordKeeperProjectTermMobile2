package com.example.passwordkeeper


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.passwordkeeper.databinding.FragmentSettingBinding
import com.example.passwordkeeper.databinding.FragmentVaultBinding

/**
 * A simple [Fragment] subclass.
 */
class SettingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentSettingBinding>(inflater,
            R.layout.fragment_setting,container,false)

        binding.vaultButton.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_settingFragment_to_vaultFragment)
        }
        binding.securityButton.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_settingFragment_to_securityFragment)
        }

        return binding.root
    }


}
