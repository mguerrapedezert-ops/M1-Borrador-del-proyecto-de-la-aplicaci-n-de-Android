package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
            val name = etName.text.toString().trim()
            val date = etDate.text.toString().trim()
            val desc = etDesc.text.toString().trim()

            val i = Intent(this, CalendarActivity::class.java)
            i.putExtra("TASK_NAME", name)
            i.putExtra("TASK_DATE", date)
            i.putExtra("TASK_DESC", desc)
            startActivity(i)
        }
    }
}
