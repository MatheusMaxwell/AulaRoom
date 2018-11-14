package com.example.matheusmaxwellmeireles.aularoom

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(version = 1, entities = arrayOf(Entities.User::class))
abstract class AppDataBase : RoomDatabase(){
    abstract fun UserDAO(): UserDAO
}