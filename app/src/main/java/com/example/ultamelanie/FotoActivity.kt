package com.example.ultamelanie

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.ultamelanie.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_foto.*

class FotoActivity : AppCompatActivity() {

    lateinit var vpAdapter : ViewPagerAdapter
    val dost = arrayOfNulls<TextView>(27)
    var curretpage: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foto)

        vpAdapter = ViewPagerAdapter(this)
        vp_foto.adapter =vpAdapter
//        dotIndikator(curretpage)
        initActions()
    }

    fun initActions(){
        vp_foto.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
//                dotIndikator(position)
                curretpage = position
            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        })
    }

//    fun dotIndikator(p:Int){
//        ll_dots.removeAllViews()
//        for (i in 0..dost.size){
//            dost[i] = TextView(this)
//            dost[i]?.textSize = 35f
//            dost[i]?.setTextColor(resources.getColor(R.color.teal_700))
//        }
//        if (dost.size > 0){
//            dost[p]?.setTextColor(resources.getColor(R.color.teal_200))
//        }
//    }
}