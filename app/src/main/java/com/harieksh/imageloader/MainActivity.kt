package com.harieksh.imageloader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBrowseRecycler()

    }

    private fun setupBrowseRecycler() {
        recycler_image.layoutManager = LinearLayoutManager(this)
        recycler_image.adapter = RecyclerViewAdapter(imageList, this)
    }

    private val imageList = arrayListOf(
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-1_1.jpg",
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-2_1.jpg",
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-3_1.jpg",
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-4_1.jpg",
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-5_1.jpg",
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-6_1.jpg",
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-7_0.jpg",
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-8_1.jpg",
        "https://gamedata.britishcouncil.org/sites/default/files/attachment/number-9_1.jpg"
    )

}
