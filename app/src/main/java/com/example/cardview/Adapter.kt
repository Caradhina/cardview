package com.example.cardview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class Adapter(private val image : IntArray, private val name: Array<String>,
                       private val gender: Array<String>, private val power: Array<String>, private val mContext : Context)
              :RecyclerView.Adapter<Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.main_page, parent, false)
        return Holder(v, mContext)
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.index(image[position], name[position], gender[position], power[position])
    }

    override fun getItemCount(): Int {
        return image.size
    }
}



