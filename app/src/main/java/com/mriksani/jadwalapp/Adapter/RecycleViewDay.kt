package com.mriksani.jadwalapp.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.mriksani.jadwalapp.Model.ListDay
import com.mriksani.jadwalapp.R

class RecycleViewDay(val context: Context, val listDay: List<ListDay>, val itemClick: (ListDay) -> Unit): RecyclerView.Adapter<RecycleViewDay.Holder>() {
    override fun onCreateViewHolder(p: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.list_hari, p, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return listDay.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindDay(listDay[position], context)
    }

    inner class Holder(itemView: View, val itemClick: (ListDay) -> Unit) : RecyclerView.ViewHolder(itemView) {

        val listImage = itemView.findViewById<ImageView>(R.id.dayImage)
        val listText = itemView.findViewById<TextView>(R.id.dayTxt)

        fun bindDay(listDay: ListDay, context: Context){
            val resourceId = context.resources.getIdentifier(listDay.images,
                "drawable", context.packageName)
            listImage.setImageResource(resourceId)
            listText.text = listDay.title
            itemView.setOnClickListener{itemClick(listDay)}
        }
    }
}