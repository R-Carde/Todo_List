package com.example.todolistaristidevs

sealed class TaskCategory {

    object Personal : TaskCategory()
    object Business : TaskCategory()
    object Other : TaskCategory()
}