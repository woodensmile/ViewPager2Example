package com.doubles.viewpager2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doubles.viewpager2example.adapter.PagerRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    val bgColors: MutableList<Int> = mutableListOf(
        android.R.color.holo_red_light,
        android.R.color.holo_green_light,
        android.R.color.holo_blue_dark
    )
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = PagerRecyclerAdapter(bgColors)
        pager.adapter = mAdapter
    }
}