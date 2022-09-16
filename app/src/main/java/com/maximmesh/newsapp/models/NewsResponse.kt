package com.maximmesh.newsapp.models

data class NewsResponse(

	val totalResults: Int,

	val articles: List<Article>,

	val status: String
)