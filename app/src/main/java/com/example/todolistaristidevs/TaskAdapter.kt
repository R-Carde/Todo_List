package com.example.todolistaristidevs

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(private val tasks:List<Task>): RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount()= tasks.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}