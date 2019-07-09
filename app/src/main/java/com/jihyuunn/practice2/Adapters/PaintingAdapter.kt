package com.jihyuunn.practice2.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jihyuunn.practice2.Model.Painting
import com.jihyuunn.practice2.R
import kotlinx.android.synthetic.main.painting_item.view.*

class PaintingAdapter(val context: Context, val painting: List<Painting>) : RecyclerView.Adapter<PaintingAdapter.paintingHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): paintingHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.painting_item, parent, false)
        return paintingHolder(view)
    }

    override fun getItemCount(): Int {
        return painting.count()
    }

    override fun onBindViewHolder(holder: paintingHolder, position: Int) {
        holder.bindPainting(painting[position], context)
    }


    inner class paintingHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val paintingImage = itemView.findViewById<ImageView>(R.id.paintingImage)
        val paintingName = itemView.findViewById<TextView>(R.id.paintingName)

        fun bindPainting(painting: Painting, context: Context) {
            val resourceId = context.resources.getIdentifier(painting.image, "drawable", context.packageName)
            paintingImage.setImageResource(resourceId)
            paintingName.text = painting.title
        }

    }

}