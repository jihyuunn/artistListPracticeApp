package com.jihyuunn.practice2.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.jihyuunn.practice2.Model.Category
import com.jihyuunn.practice2.R
import com.jihyuunn.practice2.Service.DataService.categories
import kotlinx.android.synthetic.main.activity_main.view.*

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_item, null)

        val imageView : ImageView = categoryView.findViewById(R.id.imageView)
        val artistNameTxt : TextView = categoryView.findViewById(R.id.artistNameTxt)


        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        imageView.setImageResource(resourceId)
        artistNameTxt.text = category.artist

        return categoryView
        }


    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}