package com.example.migasto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Gas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_gas)
    }

    fun returnMainMenu(view: View){
        val intent = Intent(this, MainMenu::class.java)
        startActivity(intent)
    }
}