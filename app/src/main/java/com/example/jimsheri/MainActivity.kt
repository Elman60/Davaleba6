package com.example.jimsheri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)

        val urlList = ArrayList<Images>()

        urlList.add(Images("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/The_Earth_seen_from_Apollo_17.jpg/1200px-The_Earth_seen_from_Apollo_17.jpg", "Earth"))
        urlList.add(Images("https://img.112.international/original/2020/07/02/290553.jpg", "Black Hole"))
        urlList.add(Images("https://www.protexinvet.com/userfiles/image/cute-2500929_1920_(1).jpg", "Bunny"))
        urlList.add(Images("https://media.ntslive.co.uk/crop/770x770/0711959c-fd69-4d00-af65-4a617de5b4e8_1539216000.jpeg", "Tupac"))
        urlList.add(Images("https://www.lowrysmodernliving.ie/wp-content/uploads/2019/04/Boru-Bench-natural-150-3-scaled.jpg", "Bench"))
        urlList.add(Images("https://science4fun.info/wp-content/uploads/2019/02/chlorine-atom.jpg", "Chlorine"))

        val adapter = imageAdapter(urlList, this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter


    }
}