package com.example.cardview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout.VERTICAL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rview = findViewById<View>(R.id.rview) as RecyclerView
        val image = intArrayOf(R.drawable.superman, R.drawable.spiderman,R.drawable.wonderwoman,R.drawable.thor,
            R.drawable.batman, R.drawable.ironman, R.drawable.blackpanther)
        val name = arrayOf("Superman","Spiderman","Wonder Woman","Thor","Batman","Iron Man","Black Panther")
        val gender = arrayOf("Male", "Male", "Female", "Male", "Male", "Male", "Male")
        val power = arrayOf("100", "90", "89", "92", "70", "95", "80")
        val lManager = LinearLayoutManager(this, VERTICAL, false)
        rview.setLayoutManager(lManager)

        rview.adapter = Adapter(image, name, gender, power, this)
    }
}
