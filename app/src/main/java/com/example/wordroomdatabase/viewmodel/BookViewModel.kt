package com.example.wordroomdatabase.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wordroomdatabase.database.BookDatabase
import com.example.wordroomdatabase.model.Book
import com.example.wordroomdatabase.repository.BookRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import java.lang.Appendable

class BookViewModel(application: Application):AndroidViewModel(application)  {
    private val repository : BookRepository
    val allBook : LiveData<List<Book>>
    init {
        val bookDao = BookDatabase.getDatabase(
            application
        ).bookDao()
        repository = BookRepository(bookDao)
        allBook = repository.allBook
    }
    suspend fun insert(book: Book) : Job = viewModelScope.launch {
        repository.bookInsert(book)
    }
}