package com.cursoKotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cursoKotlin.firstApp.FirstActivity
import com.example.newkotlin.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludAPP)
        btnSaludApp.setOnClickListener{}

    }

    fun navigateToSaludApp(){
        val intent = Intent(this, FirstActivity::class.java)
    }
}
