package com.maximmesh.newsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "articles")
data class Article(
	@PrimaryKey(autoGenerate = true)
	val id: Int? = null,

	val publishedAt: String,

	val author: Any,

	val urlToImage: String,

	val description: String,

	val source: Source,

	val title: String,

	val url: String,

	val content: String
)