package com.maximmesh.newsapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.maximmesh.newsapp.models.Article

interface ArticleDao { //этот интерфейс будет получать все статьи,вставлять новые,удалять

    @Query("SELECT * FROM articles")
    suspend fun getAllArticles(): LiveData<List<Article>> //получает все статьи

    @Insert(onConflict = OnConflictStrategy.REPLACE) // при каком-либо конфликте будет замена статьи в БД
    suspend fun insert(article: Article)  //добавляет статьи

    @Delete
    suspend fun delete(article: Article) //удаляет стати
}