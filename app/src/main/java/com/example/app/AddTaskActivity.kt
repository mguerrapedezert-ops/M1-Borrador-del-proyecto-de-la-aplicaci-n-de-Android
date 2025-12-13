package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        val etName = findViewById<EditText>(R.id.etTaskName)
        val etDate = findViewById<EditText>(R.id.etTaskDate)
        val etDesc = findViewById<EditText>(R.id.etTaskDesc)
        val btnSave = findViewById<Button>(R.id.btnSaveTask)

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val date = etDate.text.toString()
            val desc = etDesc.text.toString()

            if (name.isEmpty() || date.isEmpty()) {
                Toast.makeText(this, "Completá nombre y fecha", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val prefs = getSharedPreferences("tasks", MODE_PRIVATE)
            prefs.edit()
                .putString("TASK_NAME", name)
                .putString("TASK_DATE", date)
                .putString("TASK_DESC", desc)
                .apply()

            Toast.makeText(this, "Tarea guardada", Toast.LENGTH_SHORT).show()

            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}
