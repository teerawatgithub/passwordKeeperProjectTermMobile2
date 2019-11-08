package com.example.passwordkeeper.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.passwordkeeper.data.Accout

class AccoutViewModel : ViewModel(){
    var acc = MutableLiveData<Accout>()
//    var acc = MutableLiveData<ArrayList<Accout>>()
    init {
        acc.value = Accout("name", "username", "password", "note")
        Log.i("AccoutViewModel", "AccoutViewModel created! ${acc.value!!.name.toString()}")
    }

    fun addAccout(name: String, username: String, password: String, note: String){
        Log.i("AddpasswordFragment", " testMask2/1")
//        acc.value =acc.add(Accout(name, username, password,note))
//        acc.value = arrayListOf(Accout(name, username, password,note))
        val buff = Accout(name, username, password, note)
        acc.value = buff
        Log.i("AddpasswordFragment", "-----${acc.value!!.name}")

    }
}