package com.example.passwordkeeper.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.passwordkeeper.data.Accout

class AccoutViewModel : ViewModel(){
//    var acc = ArrayList<Accout>()
    var acc = MutableLiveData<ArrayList<Accout>>()
    init {
        Log.i("AccoutViewModel", "AccoutViewModel created!")
    }

    fun addAccout(name: String, username: String, password: String, note: String){
//        acc.value =acc.add(Accout(name, username, password,note))
        acc.value = arrayListOf(Accout(name, username, password,note))
    }
}