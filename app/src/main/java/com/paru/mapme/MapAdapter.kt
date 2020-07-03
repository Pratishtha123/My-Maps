package com.paru.mapme

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paru.mapme.models.UserMap

class MapAdapter(val context: Context, val userMaps: List<UserMap>) : RecyclerView.Adapter<MapAdapter.ViewHolder>() {

       override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
           val view=LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,parent,false)
           return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userMaps.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val userMap=userMaps[position]
            val textViewTitle=holder.itemView.findViewById<TextView>(android.R.id.text1)
            textViewTitle.text=userMap.title
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)


}
