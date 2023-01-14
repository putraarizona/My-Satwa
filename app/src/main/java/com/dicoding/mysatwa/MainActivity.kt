package com.dicoding.mysatwa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSatwa: RecyclerView
    private var list: ArrayList<Satwa> = arrayListOf()
    private var title: String = "My Satwa"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvSatwa = findViewById(R.id.rv_satwa)
        rvSatwa.setHasFixedSize(true)

        list.addAll(SatwaData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profile -> {
                val moveIntent = Intent(this@MainActivity, MoveAbout::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList() {
        rvSatwa.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListSatwaAdapter(list, this@MainActivity)
        rvSatwa.adapter = listHeroAdapter
    }
}