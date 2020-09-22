package com.example.recyclerviewhelloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HelloAdapter(val helloList:List<Hello>):RecyclerView.Adapter<HelloAdapter.ViewHolder>() {

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val helloImage:ImageView =view.findViewById(R.id.helloImage)
        val helloName:TextView =view.findViewById(R.id.helloText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.hello_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hello =helloList[position]
        holder.helloImage.setImageResource(hello.imageId)
        holder.helloName.text=hello.name
    }

    override fun getItemCount(): Int {
        return  helloList.size
    }
}