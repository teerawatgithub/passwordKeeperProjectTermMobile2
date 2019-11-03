package com.example.passwordkeeper


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.passwordkeeper.databinding.FragmentGenerateBinding
import com.example.passwordkeeper.databinding.FragmentVaultBinding
import kotlinx.android.synthetic.main.fragment_generate.*


class GenerateFragment : Fragment() {
    private var passGen: GeneratePasswordData = GeneratePasswordData()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGenerateBinding>(inflater,
            R.layout.fragment_generate,container,false)


        binding.generateButton.setOnClickListener { view: View ->
            var myPassword = generateRandomPassword(binding.seekBar.progress)
            passGen.passwordValue = myPassword
            passGen.length = binding.seekBar.progress
            binding.seek = passGen
            binding.invalidateAll()
        }


        return binding.root
    }


    fun generateRandomPassword(length: Int): String {
        val chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        var passWord = ""
        for (i in 1..length) {
            passWord += chars[Math.floor(Math.random() * chars.length).toInt()]
        }
        return passWord
    }

}
