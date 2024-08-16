package com.cursoKotlin.firstApp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

import com.example.newkotlin.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)
        val btnEntrar = findViewById<AppCompatButton>(R.id.Entrar)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnEntrar.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()){

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

    }
}


