package com.example.burguerdelivery

import android.content.Intent
import android.os.Bundle

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.burguerdelivery.adapters.BurguerAdapters
import com.example.burguerdelivery.api.ProdutoService
import com.example.burguerdelivery.databinding.ActivityMainBinding
import com.example.burguerdelivery.model.BurguerChar

class MainActivity : AppCompatActivity(), BurguerAdapters.myClick{

    private lateinit var binding: ActivityMainBinding

    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<BurguerChar> = arrayListOf()
    private var gridLayoutManager: GridLayoutManager? = null
    private var burguerAdapters: BurguerAdapters? = null
    private val imageList = arrayListOf<SlideModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSair.setOnClickListener {
            val sair = Intent(this, TelaDeLogin::class.java)
            startActivity(sair)
        }

        imageList.add(SlideModel(R.drawable.banner_promo_01))
        imageList.add(SlideModel(R.drawable.banner_promo_02))
        imageList.add(SlideModel(R.drawable.banner_promo_03))

        val sliderLayout = findViewById<ImageSlider>(binding.sliderLayout.id)
        sliderLayout.setImageList(imageList)


        recyclerView = binding.myRecyleView
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        burguerAdapters = BurguerAdapters(charItem, this@MainActivity)
        recyclerView?.adapter = burguerAdapters

    }

    override fun onResume() {
        super.onResume()
        setDataList()
    }



    private fun  setDataList() {


        ProdutoService.produtos(

            onSuccess = {
                (it as? ArrayList)?.let {
                    val starPosition = charItem.size
                    charItem.addAll(it)
                    burguerAdapters?.notifyItemRangeChanged(starPosition, charItem.size)
                } ?: run {
                    Toast.makeText(this, "erro na resposta", Toast.LENGTH_LONG).show()
                }
            },
            onFailure = {
                Toast.makeText(this, it, Toast.LENGTH_LONG).show()
            }


        )
    }

    override  fun onClick(char: BurguerChar) {
        val intent = Intent(this, DetalhamentoProduto::class.java)
        intent.putExtra("burguer", char)
        startActivity(intent)
    }


}