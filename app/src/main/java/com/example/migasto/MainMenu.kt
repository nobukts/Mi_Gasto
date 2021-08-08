package com.example.migasto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_main)
    }

    fun changeToLightMenu(view: View){
        val intent = Intent(this, Light::class.java)
        startActivity(intent)
    }

    fun changeToGasMenu(view: View){
        val intent = Intent(this, Gas::class.java)
        startActivity(intent)
    }


}