package com.example.wordroomdatabase.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "book_table")
class Book (
    @PrimaryKey
    @ColumnInfo(name = "book_name")
    var bookName : String
)