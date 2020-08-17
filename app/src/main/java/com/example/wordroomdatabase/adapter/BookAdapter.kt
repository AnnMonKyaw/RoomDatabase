package com.example.wordroomdatabase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wordroomdatabase.R
import com.example.wordroomdatabase.model.Book
import kotlinx.android.synthetic.main.fragment_home.view.*

class BookAdapter(var bookList : List <Book> = ArrayList()):RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    class BookViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        fun bindBook(book: Book)
        {
            this.itemView.textBookName.text=book.bookName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_book,parent,false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bindBook(bookList[position])
    }
    fun addBookList(book: List<Book>)
    {
        this.bookList=book
        notifyDataSetChanged()
    }
}