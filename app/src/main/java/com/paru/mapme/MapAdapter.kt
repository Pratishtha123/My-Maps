package com.paru.mapme

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paru.mapme.models.UserMap

class MapAdapter(val context: Context, val userMaps: List<UserMap>, val onClickListener: OnClickListener) : RecyclerView.Adapter<MapAdapter.ViewHolder>() {

    interface OnClickListener{
        fun onItemClick(position: Int)
    }

       override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
           val view=LayoutInflater.from(context).inflate(R.layout.item_user_map,parent,false)
           return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userMaps.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val userMap=userMaps[position]
            holder.itemView.setOnClickListener{
                onClickListener.onItemClick(position)
            }
            val textViewTitle=holder.itemView.findViewById<TextView>(R.id.tvMapTitle)
            textViewTitle.text=userMap.title
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)


}
