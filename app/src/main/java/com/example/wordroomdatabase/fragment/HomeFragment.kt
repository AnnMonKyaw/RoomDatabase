package com.example.wordroomdatabase.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.wordroomdatabase.R
import com.example.wordroomdatabase.model.Book
import com.example.wordroomdatabase.viewmodel.BookViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val bookViewModel = ViewModelProvider(this).get(BookViewModel::class.java)
//        bookViewModel.insert(Book("Android"))
//        bookViewModel.allBook.observe(viewLifecycleOwner, Observer { books->
//            textBookName.text=books.get(0).bookName
//        })
//        //textBookName.text=bookViewModel.allBook.get(0).bookName
//    }
}