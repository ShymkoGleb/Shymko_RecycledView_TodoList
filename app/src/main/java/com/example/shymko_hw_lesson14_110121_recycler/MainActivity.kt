package com.example.shymko_hw_lesson14_110121_recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoList = mutableListOf(
            Todo("todo task 1", false),
            Todo("todo task 2", false),
            Todo("todo task 3", false),
            Todo("todo task 4", false),
            Todo("todo task 5", false),
            Todo("todo task 6", false),
            Todo("todo task 7", false),
        )
        val adaptor = TodoAdaptor(todoList)
        rvTodos.adapter = adaptor
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adaptor.notifyItemInserted(todoList.size - 1)
        }
    }
}