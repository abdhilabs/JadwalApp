package com.mriksani.jadwalapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.mriksani.jadwalapp.Adapter.RecycleViewDay
import com.mriksani.jadwalapp.Utilities.EXTRA_DAY
import com.mriksani.jadwalapp.R
import com.mriksani.jadwalapp.Services.Data
import kotlinx.android.synthetic.main.activity_hari.*

class HariActivity : AppCompatActivity() {

    lateinit var adapter: RecycleViewDay

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hari)

        adapter = RecycleViewDay(this, Data.list){listDay ->
            val pindah = Intent(this, JadwalActivity::class.java)
            pindah.putExtra(EXTRA_DAY, listDay.title)
            startActivity(pindah)
        }
        list_day_view.adapter = adapter

        val layoutManager = GridLayoutManager(this,3)
        list_day_view.layoutManager = layoutManager
        list_day_view.adapter = (adapter)
    }
}
