package com.jihyuunn.practice2.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jihyuunn.practice2.Model.Category
import com.jihyuunn.practice2.R

class CategoryRecyclerAdapter(val context: Context, val categories: List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false)
        return Holder(view, itemClick)

    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], context)
    }


    inner class Holder(itemView: View, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val artistImage = itemView.findViewById<ImageView>(R.id.artistImage)
        val artistNameTxt = itemView.findViewById<TextView>(R.id.artistNameTxt)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

            artistImage.setImageResource(resourceId)
            artistNameTxt.text = category.artist
            itemView.setOnClickListener { itemClick(category) }


        }
    }


}