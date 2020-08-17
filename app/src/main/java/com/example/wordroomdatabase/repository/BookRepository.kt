package com.example.wordroomdatabase.repository

import androidx.lifecycle.LiveData
import com.example.wordroomdatabase.dao.BookDao
import com.example.wordroomdatabase.model.Book

class BookRepository(private val bookDao: BookDao) {
    val allBook:LiveData<List<Book>> = bookDao.getAllBook()

    suspend fun bookInsert(book: Book)
    {
        bookDao.saveBook(book)
    }
}