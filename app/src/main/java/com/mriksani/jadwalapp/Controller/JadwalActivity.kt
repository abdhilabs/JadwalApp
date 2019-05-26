package com.mriksani.jadwalapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mriksani.jadwalapp.Utilities.EXTRA_DAY
import com.mriksani.jadwalapp.R
import kotlinx.android.synthetic.main.activity_senin.*

class JadwalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senin)

        val day = intent.getStringExtra(EXTRA_DAY)
        hariTxt.text = "Hari $day"

    }
}
