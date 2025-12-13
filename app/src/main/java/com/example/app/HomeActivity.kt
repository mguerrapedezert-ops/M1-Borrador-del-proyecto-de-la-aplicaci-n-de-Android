package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Referencias a la UI
        val btnAddTask = findViewById<Button>(R.id.btnGoAddTask)
        val tvLastTask = findViewById<TextView>(R.id.tvLastTask)

        // Recibir última tarea desde CalendarActivity
        val lastTaskName = intent.getStringExtra("LAST_TASK_NAME")

        if (!lastTaskName.isNullOrEmpty()) {
            tvLastTask.text = "Última tarea agregada: $lastTaskName"
        } else {
            tvLastTask.text = "Última tarea: (ninguna)"
        }

        // Ir a pantalla Agregar Tarea
        btnAddTask.setOnClickListener {
            val intent = Intent(this, AddTaskActivity::class.java)
            startActivity(intent)
        }
    }
}

