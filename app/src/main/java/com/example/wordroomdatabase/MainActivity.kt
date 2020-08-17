package com.example.wordroomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.wordroomdatabase.adapter.BookAdapter
import com.example.wordroomdatabase.database.BookDatabase
import com.example.wordroomdatabase.model.Book
import com.example.wordroomdatabase.viewmodel.BookViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    lateinit var bookAdapter : BookAdapter
    lateinit var bookViewModel: BookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bookViewModel = ViewModelProvider(this).get(BookViewModel::class.java)

        bookAdapter = BookAdapter()

        recyclerView.apply {
            layoutManager= LinearLayoutManager(context)
            adapter=bookAdapter
        }

        bookViewModel.allBook.observe(this, Observer { book->
            book.let {
                bookAdapter.addBookList(book)
            }
        })

//        bookViewModel.insert(Book("Android"))
//        bookViewModel.allBook.observe(viewLi, Observer { books->
//            textBookName.text=books.get(0).bookName
//        })

//        val db = Room.databaseBuilder(
//            applicationContext, BookDatabase::class.java,
//            "BookDB"
//        ).build()

//        Thread{ // run for once time
//            val book=Book(
//                    1,
//                    "Android Development"
//            )
//            db.bookDao().saveBook(book)
//            db.bookDao().getAllBook().forEach{
//                Log.d("FetchDatabase>>>>>>>>","${it.bookID}")
//                Log.d("FetchDatabase>>>>>>>>","${it.bookName}")
//                textName.text = it.bookName
//            }
//        }.start()
    }
}