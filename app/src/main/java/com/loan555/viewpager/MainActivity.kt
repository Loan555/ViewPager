package com.loan555.viewpager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.loan555.viewpager.fragment.ViewPagerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace<ViewPagerFragment>(R.id.fragment_container_view)
            setReorderingAllowed(false)
            addToBackStack("Home")
        }

        btDemo.setOnClickListener {
            btDemoClick()
        }

        btNext.setOnClickListener {
            btNextClick()
        }

        btDemo2.setOnClickListener {
            startActivity(Intent(this, TestActivity2::class.java))
        }
    }

    private fun btDemoClick() {
        startActivity(Intent(this, TestActivity::class.java))
    }

    private fun btNextClick() {

    }
}