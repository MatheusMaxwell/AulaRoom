package com.example.matheusmaxwellmeireles.aularoom

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

class Entities {

    @Entity(tableName = "user")
    data class User(
            @PrimaryKey
            var id : Int? = 0,
            var nome: String? = ""
    )

}