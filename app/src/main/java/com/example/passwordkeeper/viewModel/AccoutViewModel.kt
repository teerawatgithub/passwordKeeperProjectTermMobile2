package com.example.passwordkeeper.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.passwordkeeper.data.Accout

class AccoutViewModel : ViewModel(){
//    var acc = ArrayList<Accout>()
    var acc = MutableLiveData<MutableList<Accout>>()


    init {
        acc.value = mutableListOf(Accout("N/A","N/A","N/A","N/A"))
    }
    fun addAccout(name: String, username: String, password: String, note: String){
        Log.i("AddpasswordFragment", " testMask2/1")
        val array = mutableListOf<Accout>()
//        array.add(acc.value!!.get(0))
        array.addAll(acc.value!!.toList())
        array.add(Accout(name, username, password, note))
        acc.value=array
    }
}