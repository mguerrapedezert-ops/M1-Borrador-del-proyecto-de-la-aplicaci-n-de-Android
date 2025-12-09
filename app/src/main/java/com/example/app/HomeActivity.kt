package com.example.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvUser = findViewById<TextView>(R.id.tvUser)
        val nombre = intent.getStringExtra("nombre") ?: "Usuario"
        tvUser.text = "Hola, $nombre 👋"
    }
}
