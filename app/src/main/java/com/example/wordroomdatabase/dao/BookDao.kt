package com.example.wordroomdatabase.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.wordroomdatabase.model.Book

@Dao
interface BookDao {
    @Query(value = "select * from book_table")
    fun getAllBook():LiveData<List<Book>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveBook(book: Book)
}