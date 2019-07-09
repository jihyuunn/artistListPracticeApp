package com.jihyuunn.practice2.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.jihyuunn.practice2.Adapters.PaintingAdapter
import com.jihyuunn.practice2.R
import com.jihyuunn.practice2.Service.DataService
import com.jihyuunn.practice2.Utility.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_painting.*

class PaintingActivity : AppCompatActivity() {

    lateinit var adapter : PaintingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_painting)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = PaintingAdapter(this, DataService.getCategory(categoryType))

        val layoutManager = LinearLayoutManager(this)
        paintingListView.layoutManager = layoutManager
        paintingListView.adapter = adapter

    }
}
