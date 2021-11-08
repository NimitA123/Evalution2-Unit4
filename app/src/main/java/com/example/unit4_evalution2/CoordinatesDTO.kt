package com.example.unit4_evalution2


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class CoordinatesDTO(

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
)