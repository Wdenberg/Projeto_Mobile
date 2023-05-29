package com.example.burguerdelivery.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserResponse(
    val isError: Boolean? = null,
    val errorMessage: String? = null,
    val data: Usuario? = null,
    val code: Int? = null
): Parcelable
