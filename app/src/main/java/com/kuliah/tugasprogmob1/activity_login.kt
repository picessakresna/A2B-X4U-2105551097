package com.kuliah.tugasprogmob1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class activity_login : AppCompatActivity() {

    private lateinit var namapengguna: EditText
    private lateinit var buttonlogin: Button


    private fun initComp()  {
        namapengguna = findViewById(R.id.inputloginnama)
        buttonlogin = findViewById(R.id.buttonlogin)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initComp()

        buttonlogin.setOnClickListener{
            startActivity(
                Intent(this, activity_start::class.java)
                    .putExtra("namapengguna", namapengguna.text.toString())
            )
        }

    }
}