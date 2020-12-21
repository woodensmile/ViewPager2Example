package com.doubles.viewpager2example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.doubles.viewpager2example.R

class PagerRecyclerAdapter(private val bgColors: List<Int>) : RecyclerView.Adapter<PagerViewHolder>()
{
    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder = PagerViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_pager, parent, false))*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pager, parent, false)
        return PagerViewHolder(view)
    }

    override fun getItemCount(): Int
    {
        return bgColors.size
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int)
    {
        holder.bind(bgColors[position], position)
    }
}

class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    private val textView: TextView = itemView.findViewById(R.id.page_name)

    fun bind(@ColorRes bgColor: Int, position: Int)
    {
        textView.text = "RecyclerViewAdapter \n Page ${position}"
        itemView.setBackgroundColor(ContextCompat.getColor(itemView.context, bgColor))
    }
}