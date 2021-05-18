package com.loan555.viewpager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.loan555.viewpager.R
import kotlinx.android.synthetic.main.itempager.view.*

class ViewPagerAdapter: RecyclerView.Adapter<ViewPagerVH>() {

    //array of colors to change the background color of screen
    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerVH =
        ViewPagerVH(LayoutInflater.from(parent.context).inflate(R.layout.itempager, parent, false))

    override fun onBindViewHolder(holder: ViewPagerVH, position: Int) = holder.itemView.run {
        when(position){
            0 -> {
                name_item.text = "ViewPager0"
                img.setImageResource(R.drawable.bg_1)
                container.setBackgroundResource(colors[position])
            }
            1 -> {
                name_item.text = "ViewPager1"
                img.setImageResource(R.drawable.bg_2)
                container.setBackgroundResource(colors[position])
            }
            2 -> {
                name_item.text = "ViewPager2"
                img.setImageResource(R.drawable.bg_3)
                container.setBackgroundResource(colors[position])
            }
            3-> {
                name_item.text = "ViewPager3"
                img.setImageResource(R.drawable.bg_4)
                container.setBackgroundResource(colors[position])
            }
        }
    }

    override fun getItemCount(): Int = colors.size
}

class ViewPagerVH(itemView: View): RecyclerView.ViewHolder(itemView)