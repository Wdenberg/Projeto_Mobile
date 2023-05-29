package com.example.burguerdelivery.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Usuario(

    val nome:String,
    val email:String,
    val password:String
): Parcelable
