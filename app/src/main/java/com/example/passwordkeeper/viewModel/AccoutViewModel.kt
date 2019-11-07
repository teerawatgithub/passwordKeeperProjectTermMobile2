package com.example.passwordkeeper.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.passwordkeeper.data.Accout

class AccoutViewModel : ViewModel(){
    lateinit var accoutList: Accout
    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }

    fun addAccout(name: String, username: String, password: String, note: String){
        accoutList
    }
}