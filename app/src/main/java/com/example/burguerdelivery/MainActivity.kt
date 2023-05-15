package com.example.burguerdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextSwitcher
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.burguerdelivery.adapters.BurguerAdapters
import com.example.burguerdelivery.databinding.ActivityMainBinding
import com.example.burguerdelivery.model.BurguerChar
import java.util.Objects

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var recyclerView: RecyclerView? = null
    private lateinit var charItem: ArrayList<BurguerChar>
    private var gridLayoutManager: GridLayoutManager? = null
    private var burguerAdapters: BurguerAdapters? = null
    private val imageList = arrayListOf<SlideModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myRecyleView.setOnClickListener {
            val detalhesItem = Intent(this, DetalhamentoProduto::class.java )
            startActivity(detalhesItem)
        }

        imageList.add(SlideModel(R.drawable.banner))
        imageList.add(SlideModel(R.drawable.banner2))

        val sliderLayout = findViewById<ImageSlider>(binding.sliderLayout.id)
        sliderLayout.setImageList(imageList)


        recyclerView = findViewById(binding.myRecyleView.id)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        charItem = setDataList() as ArrayList<BurguerChar>
        burguerAdapters = BurguerAdapters(this, charItem)
        recyclerView?.adapter = burguerAdapters



        val pesquisa = findViewById<TextView>(binding.btnpesquisa.id)



        pesquisa.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                charItem = setDataList(s.toString()) as ArrayList<BurguerChar>
                burguerAdapters = BurguerAdapters(applicationContext, charItem)
                recyclerView?.adapter = burguerAdapters
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })


    }


    private fun  setDataList(name: String = ""): List<BurguerChar> {

        var itemBurguer: ArrayList<BurguerChar> = ArrayList()

        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burger", 24.90))
        itemBurguer.add(BurguerChar(R.drawable.golden_burger, "Tradicional", "Golden Burger", 25.90))
        itemBurguer.add(BurguerChar(R.drawable.monster_burger, "Tradicional", "Monster Burger", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.old_burger, "Tradicional", "Old Burger", 27.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer", 24.90))
        itemBurguer.add(BurguerChar(R.drawable.golden_burger, "Tradicional", "Golden Burger", 25.90))
        itemBurguer.add(BurguerChar(R.drawable.monster_burger, "Tradicional", "Monster Burger", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.old_burger, "Tradicional", "Old Burger", 27.90))
        itemBurguer.add(BurguerChar(R.drawable.monster_burger, "Tradicional", "Monster Burger", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.old_burger, "Tradicional", "Old Burger", 27.90))
        itemBurguer.add(BurguerChar(R.drawable.golden_burger, "Tradicional", "Golden Burger", 25.90))
        itemBurguer.add(BurguerChar(R.drawable.monster_burger, "Tradicional", "Monster Burger", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.old_burger, "Tradicional", "Old Burger", 27.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer", 24.90))
        itemBurguer.add(BurguerChar(R.drawable.golden_burger, "Tradicional", "Golden Burger", 25.90))
        itemBurguer.add(BurguerChar(R.drawable.monster_burger, "Tradicional", "Monster Burger", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.old_burger, "Tradicional", "Old Burger", 27.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer", 24.90))
        itemBurguer.add(BurguerChar(R.drawable.golden_burger, "Tradicional", "Golden Burger", 25.90))
        itemBurguer.add(BurguerChar(R.drawable.monster_burger, "Tradicional", "Monster Burger", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.old_burger, "Tradicional", "Old Burger", 27.90))
        itemBurguer.add(BurguerChar(R.drawable.texas_burger, "Tradicional", "Texas Burguer", 24.90))
        itemBurguer.add(BurguerChar(R.drawable.golden_burger, "Tradicional", "Golden Burger", 25.90))
        itemBurguer.add(BurguerChar(R.drawable.monster_burger, "Tradicional", "Monster Burger", 34.90))
        itemBurguer.add(BurguerChar(R.drawable.old_burger, "Tradicional", "Old Burger", 27.90))

        if(name.isNotEmpty()){

        return itemBurguer.filter {
                it.name?.contains(name, true) ?: false
            }
        }
        return itemBurguer
    }








}