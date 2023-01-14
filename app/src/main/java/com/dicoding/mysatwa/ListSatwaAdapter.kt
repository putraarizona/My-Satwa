package com.dicoding.mysatwa

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSatwaAdapter(private val listSatwa: ArrayList<Satwa>, private val context: Context) : RecyclerView.Adapter<ListSatwaAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLatin: TextView = itemView.findViewById(R.id.tv_item_name_latin)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_satwa, parent, false)
        return ListViewHolder(view)
    }

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val model = listSatwa[position]
        Glide.with(holder.itemView.context)
            .load(model.photo)
            .apply(RequestOptions().override(100, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = model.name
        holder.tvLatin.text = model.name_latin
        holder.tvDetail.text = model.detail

        holder.itemView.setOnClickListener {
            var gName : String = model.name
            var gLatin : String = model.name_latin
            var gLatin2 : String = model.name_latin2
            var gDesc : String = model.detail
            var gTaksonomi : String = model.taksonomi
            var gImageView : Int = model.photo

            val intent = Intent(context, DetailSatwaActivity::class.java)

            intent.putExtra("iName",gName)
            intent.putExtra("iLatin",gLatin)
            intent.putExtra("iLatin2",gLatin2)
            intent.putExtra("iDesc",gDesc)
            intent.putExtra("iTaksonomi",gTaksonomi)
            intent.putExtra("iImageView",gImageView)
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return listSatwa.size
    }
}