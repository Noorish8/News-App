package com.example.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.rectangles)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val items=fetchData()
        val adapter= NewsListAdapter(items,this)
        recyclerView.adapter=adapter
        ///
    }
    private fun fetchData(): ArrayList<String> {
        //val url="https://newsapi.org/v2/everything?q=tesla&from=2021-08-06&sortBy=publishedAt&apiKey=API_KEY"
        val list = ArrayList<String>()
        for (i in 0 until 100) {
            list.add("item $i")
        }
        return list
    }

    fun onItemClicked(item: String){
        Toast.makeText(this,"click item is $item",Toast.LENGTH_LONG ).show()
    }
    }

