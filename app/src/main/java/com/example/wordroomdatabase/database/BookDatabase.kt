package com.example.wordroomdatabase.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.wordroomdatabase.dao.BookDao
import com.example.wordroomdatabase.model.Book
import java.security.AccessControlContext

@Database(entities = [(Book::class)],version = 1)
abstract class BookDatabase : RoomDatabase(){
    abstract fun bookDao():BookDao

    companion object{
        private var INSTANCE : BookDatabase? =null
        fun getDatabase(context: Context) :BookDatabase
        {
            val temInstance = INSTANCE
            if(temInstance!=null)
            {
                return temInstance
            }
            synchronized(this){
                val instance=Room.databaseBuilder(
                    context,BookDatabase::class.java,"BookDB"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}