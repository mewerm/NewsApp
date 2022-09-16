package com.maximmesh.newsapp.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Source(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Any
) : Parcelable