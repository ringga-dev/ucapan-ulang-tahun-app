package com.example.ultamelanie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter
import com.example.ultamelanie.R

class ViewPagerAdapter(val context: Context) : PagerAdapter() {
    val imgArray: IntArray = intArrayOf(
        R.drawable.foto_1, R.drawable.foto_2, R.drawable.foto_3,
        R.drawable.foto_4, R.drawable.foto_5, R.drawable.foto_6,
        R.drawable.foto_7, R.drawable.foto_8, R.drawable.foto_9,
        R.drawable.foto_10, R.drawable.foto_11, R.drawable.foto_12,
        R.drawable.foto_13, R.drawable.foto_14, R.drawable.foto_15,
        R.drawable.foto_16, R.drawable.foto_17, R.drawable.foto_18,
        R.drawable.foto_19, R.drawable.foto_20, R.drawable.foto_21,
        R.drawable.foto_22, R.drawable.foto_23, R.drawable.foto_24,
        R.drawable.foto_25, R.drawable.foto_26, R.drawable.foto_27
    )

    val titleArray: Array<String> = arrayOf(
        context.getString(R.string.foto_1),context.getString(R.string.foto_2) ,
        context.getString(R.string.foto_3),context.getString(R.string.foto_4),
        context.getString(R.string.foto_5),context.getString(R.string.foto_6),
        context.getString(R.string.foto_7),context.getString(R.string.foto_8) ,
        context.getString(R.string.foto_9),context.getString(R.string.foto_10),
        context.getString(R.string.foto_11),context.getString(R.string.foto_12),
        context.getString(R.string.foto_13),context.getString(R.string.foto_14) ,
        context.getString(R.string.foto_15),context.getString(R.string.foto_16),
        context.getString(R.string.foto_17),context.getString(R.string.foto_18),
        context.getString(R.string.foto_19),context.getString(R.string.foto_20),
        context.getString(R.string.foto_21),context.getString(R.string.foto_22) ,
        context.getString(R.string.foto_23),context.getString(R.string.foto_24),
        context.getString(R.string.foto_25),context.getString(R.string.foto_26),
        context.getString(R.string.foto_27)
    )

    override fun getCount(): Int {
        return imgArray.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view:View = LayoutInflater.from(context).inflate(R.layout.item_card, container, false)
        val iv_foto: ImageView = view.findViewById(R.id.iv_foto)
        val tv_title: TextView = view.findViewById(R.id.tv_title)

        iv_foto.setImageDrawable(ContextCompat.getDrawable(context, imgArray[position]))
        tv_title.text = titleArray[position].toString()
        container.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val view: View = `object` as View
        container.removeView(view)

    }
}