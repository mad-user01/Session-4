package com.example.cinemawatches

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.cinemawatches.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun click3(view: View) {
        val intent = Intent(this, ChatListScreen::class.java)
        startActivity(intent)
    }
    fun click2(view: View) {
        val intent = Intent(this, CompilationScreen::class.java)
        startActivity(intent)
    }
    fun click1(view: View) {
            val intent = Intent(this, FavoritesScreen::class.java)
        startActivity(intent)
    }
}

//test