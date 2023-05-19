package com.example.burguerdelivery.adapters

import android.content.Context
import android.content.Intent
import android.location.GnssAntennaInfo.Listener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.burguerdelivery.DetalhamentoProduto
import com.example.burguerdelivery.MainActivity
import com.example.burguerdelivery.R
import com.example.burguerdelivery.databinding.GridLayoutListItemBinding
import com.example.burguerdelivery.model.BurguerChar

class BurguerAdapters ( var context: Context, var arrayList: ArrayList<BurguerChar>, val listener: myClick): RecyclerView.Adapter<BurguerAdapters.ItemBurguer>(){



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

           image.setImageResource(charBurguer.img!!)
           subName.text = charBurguer.subName
           name.text = charBurguer.name
           price.text = charBurguer.price.toString()
           name.setOnClickListener {
               Toast.makeText(context, charBurguer.name, Toast.LENGTH_LONG).show()
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