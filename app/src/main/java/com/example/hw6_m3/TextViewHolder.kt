package com.example.hw6_m3

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hw6_m3.databinding.ItemTextBinding

class TextViewHolder(var binding: ItemTextBinding): ViewHolder(binding.root) {

    fun bind(item: String){
           binding.tvText.text = item

    }
}