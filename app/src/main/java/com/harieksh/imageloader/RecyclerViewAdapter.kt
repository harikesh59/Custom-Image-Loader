package com.harieksh.imageloader

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.harieksh.imageloader.utils.ImageLoader

/**
 * Created by Harikesh on 2/1/2020.
 */

class RecyclerViewAdapter(private val imageUrl: ArrayList<String>, private val context: Context) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater
            .from(context)
            .inflate(R.layout.item_image, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageUrl.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        ImageLoader.with(context).load(holder.imageView, imageUrl[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.image_view)

    }
}