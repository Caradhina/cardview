package com.example.cardview

import android.content.Context
import android.media.Image
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class Holder (itemView: View, private val mContext: Context) : RecyclerView.ViewHolder(itemView){
    private val iview : ImageView
    private val heroname : TextView
    private val herogender : TextView
    private val heropower: TextView

    init {
        iview = itemView.findViewById<View>(R.id.iview) as ImageView
        heroname = itemView.findViewById<View>(R.id.textViewName) as TextView
        herogender = itemView.findViewById<View>(R.id.textViewGender) as TextView
        heropower = itemView.findViewById<View>(R.id.textViewPower) as TextView
    }

    fun index(item : Int, sone: String, stwo: String, sthree: String ){
        Glide.with(mContext).load(item).into(iview)
        heroname.text = sone
        herogender.text = stwo
        heropower.text = sthree

    }

}