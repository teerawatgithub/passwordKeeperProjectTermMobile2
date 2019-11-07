package com.example.passwordkeeper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (var accoutList: Array<Accout>) : RecyclerView.Adapter<CustomAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return accoutList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val accout: Accout = accoutList[position]
        holder.textViewName.text = accout.name
        holder.textVieUsername.text = accout.username
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textVieUsername = itemView.findViewById(R.id.textVieUsername) as TextView
    }
}