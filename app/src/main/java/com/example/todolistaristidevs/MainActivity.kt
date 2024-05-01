package com.example.todolistaristidevs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val categories = listOf(
        TaskCategory.Personal,
        TaskCategory.Business,
        TaskCategory.Other
    )


    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoryAdapter
    private lateinit var rvTasks: RecyclerView

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

    }
}