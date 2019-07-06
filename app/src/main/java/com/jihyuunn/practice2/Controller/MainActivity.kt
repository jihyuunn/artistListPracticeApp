package com.jihyuunn.practice2.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.jihyuunn.practice2.Adapters.CategoryAdapter
import com.jihyuunn.practice2.R
import com.jihyuunn.practice2.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        artListView.adapter = adapter
    }
}
