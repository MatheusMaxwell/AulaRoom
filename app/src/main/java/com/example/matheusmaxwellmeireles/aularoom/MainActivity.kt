package com.example.matheusmaxwellmeireles.aularoom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = Entities.User(1, "Matheus")

        MyApplication.database?.UserDAO()?.insertUsers(user)
        /*MyApplication.database?.UserDAO()?.updateUser(user)
        MyApplication.database?.UserDAO()?.deleteUser(user)*/

        var resultado = MyApplication.database?.UserDAO()?.getAllUsers()


    }
}
