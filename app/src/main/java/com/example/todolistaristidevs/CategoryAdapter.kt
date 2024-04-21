package com.example.todolistaristidevs

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val categories:List<TaskCategory>) : RecyclerView.Adapter<CategoryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = categories.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}