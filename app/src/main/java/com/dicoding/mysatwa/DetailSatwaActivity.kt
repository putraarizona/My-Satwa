package com.dicoding.mysatwa

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailSatwaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_satwa)

        val photo : ImageView = findViewById(R.id.img_item_photo)
        val itemName: TextView = findViewById(R.id.tv_item_name)
        val itemNameLatin: TextView = findViewById(R.id.tv_item_name_latin)
        val itemDesc: TextView = findViewById(R.id.tv_item_desc)
        val itemTaksonomi: TextView = findViewById(R.id.tv_item_desc_taksonomi)

        val aName = intent.getStringExtra("iName")
        val aLatin2 = intent.getStringExtra("iLatin2")
        val aDesc = intent.getStringExtra("iDesc")
        val aTaksonomi = intent.getStringExtra("iTaksonomi")
        val aPhoto = intent.getIntExtra("iImageView", 0)

        Glide.with(this)
            .load(aPhoto)
            .into(photo)


        itemName.text = aName
        itemNameLatin.text = aLatin2
        itemDesc.text = aDesc
        itemTaksonomi.text = aTaksonomi
    }
}