package com.example.hw6_m3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw6_m3.databinding.ItemTextBinding

class TextAdapter ( var textList: ArrayList<String>): Adapter<TextViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        return TextViewHolder(ItemTextBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
       return textList.size
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.bind(textList.get(position))
    }
}