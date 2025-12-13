package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val name = intent.getStringExtra("TASK_NAME") ?: ""
        val date = intent.getStringExtra("TASK_DATE") ?: ""
        val desc = intent.getStringExtra("TASK_DESC") ?: ""

        val tvName = findViewById<TextView>(R.id.tvTaskName)
        val tvDate = findViewById<TextView>(R.id.tvTaskDate)
        val tvDesc = findViewById<TextView>(R.id.tvTaskDesc)
        val btnBack = findViewById<Button>(R.id.btnBackHome)

        tvName.text = "Tarea: $name"
        tvDate.text = "Fecha: $date"
        tvDesc.text = "Descripción: $desc"

        btnBack.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            i.putExtra("LAST_TASK_NAME", name)
            i.putExtra("LAST_TASK_DATE", date)
            startActivity(i)
        }
    }
}
