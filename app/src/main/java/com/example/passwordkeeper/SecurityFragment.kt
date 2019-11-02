package com.example.passwordkeeper


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.passwordkeeper.databinding.FragmentSecurityBinding
import com.example.passwordkeeper.databinding.FragmentVaultBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SecurityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentSecurityBinding>(inflater,
            R.layout.fragment_security,container,false)
        binding.vaultButton.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_securityFragment_to_vaultFragment)
        }
        binding.settingButton.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_securityFragment_to_settingFragment)
        }
        return binding.root
    }


}
