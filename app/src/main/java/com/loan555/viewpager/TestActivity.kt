package com.loan555.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.loan555.viewpager.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        view_pager2.adapter = ViewPagerAdapter()
    }
}