package com.example.cinemawatches

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignInScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)
    }

    fun click(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}