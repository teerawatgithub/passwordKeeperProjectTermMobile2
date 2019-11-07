package com.example.passwordkeeper

import android.util.Log
import androidx.lifecycle.ViewModel

class AccoutViewModel : ViewModel(){
    lateinit var accoutList: Accout
    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }

    fun addAccout(name: String, username: String, password: String, note: String){
        accoutList
    }
}