package com.example.todolistaristidevs

import android.app.Dialog
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todolistaristidevs.TaskCategory.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private val categories = listOf(
        Personal,
        Business,
        Other
    )
    private val tasks = mutableListOf(
        Task("Prueba Bussiness", Business),
        Task("Prueba Personal", Personal),
        Task("Prueba Other", Other),
    )


    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoryAdapter
    private lateinit var rvTasks: RecyclerView
    private lateinit var taskAdapter:TaskAdapter
    private lateinit var favAddTask: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initComponents()
        initUi()
        initListeners()
    }

    private fun initListeners() {
        favAddTask.setOnClickListener {
           showDialog()
        }
    }

    private fun showDialog(){
        val dialog = Dialog(this)
    }

    fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
        favAddTask = findViewById(R.id.favAddTask)

    }
    fun initUi() {
        categoriesAdapter = CategoryAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rvCategories.adapter = categoriesAdapter

        taskAdapter= TaskAdapter(tasks)
        rvTasks.layoutManager=LinearLayoutManager(this)
        rvTasks.adapter = taskAdapter
    }
}