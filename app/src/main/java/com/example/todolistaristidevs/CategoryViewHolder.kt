package com.example.todolistaristidevs
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CategoryViewHolder(view:View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName:TextView = view.findViewById<TextView>(R.id.tvCategoryName)
    private val divider:View=view.findViewById<TextView>(R.id.divider)
    fun render(taskCategory:TaskCategory){
            tvCategoryName.text="Ejemplo"

        when(taskCategory){
                TaskCategory.Personal -> {
                    tvCategoryName.text = "Personal"
                    divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.todo_personal_category))
                }
                TaskCategory.Business -> {
                    tvCategoryName.text = "Business"
                    divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.todo_business_category)   )             }
                TaskCategory.Other ->{
                    tvCategoryName.text = "Other"
                    divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.todo_other_category)   )             }
        }

    }
}