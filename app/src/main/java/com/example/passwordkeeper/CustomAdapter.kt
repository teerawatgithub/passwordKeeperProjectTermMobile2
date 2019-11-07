package com.example.passwordkeeper

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (var accoutList: ArrayList<Accout>,var fragment: VaultFragment) : RecyclerView.Adapter<CustomAdapter.ViewHolder> () {
    var accoutListt = accoutList
    var fragments = fragment
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return accoutListt.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val accout: Accout = accoutListt[position]
        Log.i("test", accout.name)
        holder.textViewName.text = accout.name
        holder.textVieUsername.text = accout.username

        holder.textVieUsername.setOnClickListener {
            Log.i("xxxx","xxxxx")
            findNavController(fragments).navigate(R.id.action_vaultFragment_to_addPasswordFragment)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textVieUsername = itemView.findViewById(R.id.textVieUsername) as TextView
    }
}