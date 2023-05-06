package com.example.burguerdelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.burguerdelivery.adapters.BurguerAdapters
import com.example.burguerdelivery.databinding.ActivityMainBinding
import com.example.burguerdelivery.model.BurguerChar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var recyclerView: RecyclerView? = null
    private lateinit var charItem: ArrayList<BurguerChar>
    private var gridLayoutManager: GridLayoutManager? = null
    private var burguerAdapters: BurguerAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        recyclerView = findViewById(binding.myRecyleView.id)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        charItem = setDataList()
        burguerAdapters = BurguerAdapters(this, charItem)
        recyclerView?.adapter = burguerAdapters

    }

    private fun  setDataList(): ArrayList<BurguerChar>{

        var itemBurguer: ArrayList<BurguerChar> = ArrayList()

        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer NOVO", 24.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer X", 34.90))

        return itemBurguer
    }
}