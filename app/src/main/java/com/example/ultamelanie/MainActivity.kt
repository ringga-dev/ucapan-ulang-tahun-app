package com.example.ultamelanie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    internal val Time = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(
            {
                startActivity(Intent(baseContext, FotoActivity::class.java))
                //  anim.setVisibility(View.GONE)
                finish()
            },Time.toLong()
        )
    }
}