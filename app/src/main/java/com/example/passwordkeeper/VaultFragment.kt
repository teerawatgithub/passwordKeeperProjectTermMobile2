package com.example.passwordkeeper


import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        binding.addButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_vaultFragment_to_addPasswordFragment)
        }
        setHasOptionsMenu(true)



        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }


}
