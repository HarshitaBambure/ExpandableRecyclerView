package com.example.expandablerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expandablerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val modelList = ArrayList<Model>()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initData()
        setRecyclerView()
    }
    private fun setRecyclerView() {
        val adapter = ExpandableRecyclerAdapter(modelList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
    }

    private fun initData() {
        modelList.add(Model(
            "harshita",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy this is sample copy"
        ))

        modelList.add(Model(
            "harshita",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy"
        ))

        modelList.add(Model(
            "harshita",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy this is sample copy"
        ))

        modelList.add(Model(
            "harshita",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy"
        ))

        modelList.add(Model(
            "harshita",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy"
        ))
        modelList.add(Model(
            "harshita",
            "25/09/2021",
            "1.0",
            "this is sample copy this is sample copy this is sample copy this is sample copy "
        ))
    }
}