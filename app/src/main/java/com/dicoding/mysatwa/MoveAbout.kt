package com.dicoding.mysatwa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MoveAbout : AppCompatActivity()  {
    private var title: String = "Profile"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_page)
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}