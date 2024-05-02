package com.example.todolistaristidevs

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder (view: View) : RecyclerView.ViewHolder(view)  {
    private val tvTask: TextView = view.findViewById(R.id.tvTask)
    private val cbTask: TextView = view.findViewById(R.id.cbtask)
    fun render(task:Task){

        tvTask.text = task.name

    }
}