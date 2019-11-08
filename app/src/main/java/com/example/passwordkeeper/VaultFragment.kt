package com.example.passwordkeeper


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.passwordkeeper.data.Accout
import com.example.passwordkeeper.databinding.FragmentVaultBinding
import com.example.passwordkeeper.viewModel.AccoutViewModel


class VaultFragment : Fragment() {
    var arr = ArrayList<Accout>()
    private lateinit var viewModel: AccoutViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentVaultBinding>(inflater,
            R.layout.fragment_vault,container,false)
        binding.securityButton.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_vaultFragment_to_securityFragment)
        }
        binding.settingButton.setOnClickListener{ view : View ->
//            view.findNavController().navigate(R.id.action_vaultFragment_to_settingFragment)
            viewModel = ViewModelProviders.of(this).get(AccoutViewModel::class.java)
            viewModel.acc.observe(this, Observer { arr })
        }
        binding.addButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_vaultFragment_to_addPasswordFragment)
        }
        setHasOptionsMenu(true)
        arr.clear()
        arr.add(
            Accout(
                "facebook",
                "teerawat1919",
                "alskjrefa",
                "awlthasdfkjawei"
            )
        )
        arr.add(
            Accout(
                "Line",
                "teerawat1919",
                "alskjrefa",
                "awlthasdfkjawei"
            )
        )
        binding.recyclerView.adapter = CustomAdapter(arr,this)


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
