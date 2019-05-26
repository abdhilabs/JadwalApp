package com.mriksani.jadwalapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mriksani.jadwalapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnBuatClicked(view: View){
        val buat = Intent(this, HariActivity::class.java)
        startActivity(buat)
    }
}
