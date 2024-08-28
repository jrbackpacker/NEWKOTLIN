package com.cursoKotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cursoKotlin.firstApp.firstActivity
import com.example.newkotlin.R
import imcCalculator.imcActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludAPP)
        val btnImcApp = findViewById<Button>(R.id.btnImcApp)
        btnSaludApp.setOnClickListener{navigateToSaludApp()}
        btnImcApp.setOnClickListener{navigateToImcApp()}



    }

    private fun navigateToImcApp() {
        val intent = Intent(this, imcActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, firstActivity::class.java)
        startActivity(intent)
    }
}
