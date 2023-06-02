package com.example.burguerdelivery.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.burguerdelivery.R
import com.example.burguerdelivery.model.BurguerChar
import com.squareup.picasso.Picasso

class BurguerAdapters (var arrayList: ArrayList<BurguerChar>, val listener: myClick):
    RecyclerView.Adapter<BurguerAdapters.ItemBurguer>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurguerAdapters.ItemBurguer {
        var itemHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_layout_list_item, parent, false)
        return ItemBurguer(itemHolder)
    }


    override fun onBindViewHolder(holder: ItemBurguer, position: Int) {
       var charBurguer: BurguerChar = arrayList.get(position)
        holder.bind(charBurguer, listener)
    }

    override fun getItemCount(): Int {
        return  arrayList.size
    }

    inner class ItemBurguer(itemView: View): RecyclerView.ViewHolder(itemView){

        var image = itemView.findViewById<ImageView>(R.id.icons_img)
        var subName = itemView.findViewById<TextView>(R.id.burguer_subName)
        var name = itemView.findViewById<TextView>(R.id.burguer_Name)
        var price = itemView.findViewById<TextView>(R.id.burguer_Price)

       fun bind(charBurguer: BurguerChar, listener: myClick){

           Picasso.get()
               .load("http://192.168.1.13/img/"+charBurguer.img)
               .into(image)
           subName.text = charBurguer.subName
           name.text = charBurguer.nome
           price.text = charBurguer.preco.toString()
           name.setOnClickListener {
               Toast.makeText(itemView.context, charBurguer.nome, Toast.LENGTH_LONG).show()
           }
           itemView.setOnClickListener {
               listener.onClick(charBurguer)
           }
       }
    }

    interface myClick{
        fun onClick(charBurguer: BurguerChar)

    }
}