package com.example.idk

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.load
import com.example.idk.databinding.ActivityMainBinding

// MainActivity.kt
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // ...
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Observar as mudanças no LiveData e atualizar a UI
        viewModel.user.observe(this) { user ->
            binding.profileImageView.load(user.profileImageUrl)
            // ...
        }
    }
}