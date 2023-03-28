package com.kuliah.tugasprogmob1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_start : AppCompatActivity() {

    private lateinit var namapengguna: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        namapengguna = findViewById(R.id.usernamastart)

        val shownamapengguna = intent.getStringExtra("namapengguna")

        namapengguna.text = "$shownamapengguna"
    }
}