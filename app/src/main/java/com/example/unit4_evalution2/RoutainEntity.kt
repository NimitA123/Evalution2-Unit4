package com.example.unit4_evalution2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "Evalution2")
class RoutainEntity  (
    @ColumnInfo(name= "name") var Name:String,
    @ColumnInfo(name= "gender")  var Gender:String,
    @ColumnInfo(name = "city") var City:String,
    @ColumnInfo(name = "country")  var Country:String,
    @ColumnInfo(name = "phone")  var Phone:String,
    @ColumnInfo(name = "email")  var Email:String
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Int = 0
}
