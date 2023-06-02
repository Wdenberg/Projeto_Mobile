package com.example.burguerdelivery.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BurguerChar(
    var id: Long = 0,
    var img: String? = null,
    var subName: String? = null,
    var descricao: String? = null,
    var nome:String? = null,
    var preco: Double? = 0.0
): Parcelable