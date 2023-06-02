package com.example.burguerdelivery.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProdutosResponse(
    val isError: Boolean? = null,
    val errorMessage: String? = null,
    val data: List<BurguerChar>? = null,
    val code: Int? = null
): Parcelable

@Parcelize
data class BaseResponse<T: Parcelable>(
    val isError: Boolean? = null,
    val errorMessage: String? = null,
    val data: T? = null,
    val code: Int? = null
): Parcelable
