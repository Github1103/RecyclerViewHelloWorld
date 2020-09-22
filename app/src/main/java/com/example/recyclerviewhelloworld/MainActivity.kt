package com.example.recyclerviewhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private  val helloList =ArrayList<Hello>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initHellos() //初始化hello图片
        val layoutManager =StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager =layoutManager
        val adapter=HelloAdapter(helloList)
        recyclerView.adapter=adapter

    }

    private fun initHellos(){
        repeat(20){
            helloList.add(Hello(getRandomLengthString("HelloWorld"),R.drawable.helloworld_1))
            helloList.add(Hello(getRandomLengthString("helloworld"),R.drawable.helloworld_2))
        }
    }

    private fun getRandomLengthString(str :String):String{
        val n=(1..20).random()
        val builder =StringBuilder()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }
}