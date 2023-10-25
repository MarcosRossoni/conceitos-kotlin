package com.example.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {

            if (!binding.vlCelsus.text.toString().isEmpty()){
                val celsius = binding.vlCelsus.text.toString().toDouble()
                val fahrenheit = String.format("%.2f", celsius * 1.8 + 32)

                binding.result.text = "$fahrenheit F"
            }else {
                binding.result.text = "Temperatura invalida"
            }
        }
    }
}