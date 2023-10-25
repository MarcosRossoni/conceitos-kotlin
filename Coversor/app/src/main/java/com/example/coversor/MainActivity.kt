package com.example.coversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coversor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euro = binding.vlEuro.text.toString().toDouble()
            var dolar = String.format("%.2f", euro * 1.6)

            binding.vlConverter.text = "$dolar$"
        }
    }
}