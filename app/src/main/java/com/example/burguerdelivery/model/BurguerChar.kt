package com.example.burguerdelivery.model

class BurguerChar {


    var img: Int? = 0
    var subName: String? = null
    var name:String? = null
    var price: Double? = 0.0

    constructor(img: Int?, subName: String?, name: String?, price: Double?) {
        this.img = img
        this.subName = subName
        this.name = name
        this.price = price
    }
}