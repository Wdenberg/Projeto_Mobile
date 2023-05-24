package com.example.burguerdelivery.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginResponse(
    val isError: Boolean? = null,
    val errorMessage: String? = null,
    val data: Usuario? = null,
    val code: Int? = null
) : Parcelable