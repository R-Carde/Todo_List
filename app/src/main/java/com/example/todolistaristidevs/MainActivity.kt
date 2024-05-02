package com.example.todolistaristidevs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todolistaristidevs.TaskCategory.*

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initComponents()
        initUi()
    }

    fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)

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