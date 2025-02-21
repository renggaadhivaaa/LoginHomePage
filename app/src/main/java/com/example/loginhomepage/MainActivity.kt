package com.example.loginhomepage

import com.example.loginhomepage.databinding.ActivityMainBinding
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get Email from LoginActivity
        val userEmail = intent.getStringExtra("USER_EMAIL")
        binding.tvUserEmail.text = "Logged in as: $userEmail"

        // Log email to LogCat
        Log.d("MainActivity", "User Email: $userEmail")
    }
}
