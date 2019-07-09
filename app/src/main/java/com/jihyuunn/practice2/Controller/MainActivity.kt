package com.jihyuunn.practice2.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import com.jihyuunn.practice2.Adapters.CategoryAdapter
import com.jihyuunn.practice2.Adapters.CategoryRecyclerAdapter
import com.jihyuunn.practice2.R
import com.jihyuunn.practice2.Service.DataService
import com.jihyuunn.practice2.Utility.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories) { category ->
            val intent = Intent(this, PaintingActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, category.artist)
            startActivity(intent)
        }
        artListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        artListView.layoutManager = layoutManager
        artListView.setHasFixedSize(true)
    }
}
