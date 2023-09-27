package com.example.hw6_m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw6_m3.databinding.FragmentBinding


class TextFragment : Fragment() {
    private lateinit var binding: FragmentBinding
    private lateinit var textList: ArrayList<String>
    private lateinit var Tadapter: TextAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        Tadapter = TextAdapter(textList)
        binding.rvText.adapter=Tadapter
    }

    private fun loadData() {
        textList= ArrayList()
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
        textList.add("text")
    }
}