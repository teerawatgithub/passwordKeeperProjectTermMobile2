package com.example.passwordkeeper


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.databinding.DataBindingUtil
import com.example.passwordkeeper.data.GeneratePasswordData
import com.example.passwordkeeper.databinding.FragmentGenerateBinding


class GenerateFragment : Fragment() {
    private var passGen: GeneratePasswordData =
        GeneratePasswordData()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGenerateBinding>(inflater,
            R.layout.fragment_generate,container,false)


        binding.generateButton.setOnClickListener { view: View ->
            var myPassword = generateRandomPassword(binding.seekBar.progress)
            passGen.passwordValue = myPassword
            passGen.length = binding.seekBar.progress
            binding.invalidateAll()
        }

        binding.seekBar?.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Write code to perform some action when progress is changed.
                passGen.length = binding.seekBar.progress
                binding.invalidateAll()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Write code to perform some action when touch is started.
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }

        })

        binding.seek = passGen
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
