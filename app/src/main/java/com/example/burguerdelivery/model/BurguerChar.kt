package com.example.burguerdelivery.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BurguerChar(
    var img: Int? = 0,
    var subName: String? = null,
    var name:String? = null,
    var price: Double? = 0.0
): Parcelable