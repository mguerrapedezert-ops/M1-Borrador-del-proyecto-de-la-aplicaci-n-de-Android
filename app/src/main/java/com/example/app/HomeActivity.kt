package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvLastTask = findViewById<TextView>(R.id.tvLastTask)
        val btnAddTask = findViewById<Button>(R.id.btnGoAddTask)
        val btnViewCalendar = findViewById<Button>(R.id.btnViewCalendar)

        val prefs = getSharedPreferences("tasks", MODE_PRIVATE)
        val taskName = prefs.getString("TASK_NAME", null)
        val taskDate = prefs.getString("TASK_DATE", null)
        val taskDesc = prefs.getString("TASK_DESC", null)

        if (taskName != null) {
            tvLastTask.text = "Última tarea: $taskName"
        } else {
            tvLastTask.text = "Última tarea: (ninguna)"
        }

        btnAddTask.setOnClickListener {
            startActivity(Intent(this, AddTaskActivity::class.java))
        }

        btnViewCalendar.setOnClickListener {
            if (taskName == null) {
                Toast.makeText(this, "No hay tareas cargadas", Toast.LENGTH_SHORT).show()
            } else {
                val i = Intent(this, CalendarActivity::class.java)
                i.putExtra("TASK_NAME", taskName)
                i.putExtra("TASK_DATE", taskDate)
                i.putExtra("TASK_DESC", taskDesc)
                startActivity(i)
            }
        }
    }
}
