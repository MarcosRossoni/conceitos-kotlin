package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val nome = binding.editNome.text.toString().trim()
            val sobrenome = binding.editSobrenome.text.toString().trim()

            if (nome.isEmpty() || sobrenome.isEmpty()){
                binding.textResult.text = "Nome não identificado"
                Toast.makeText(
                    applicationContext, "Nome não identificado", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            binding.textResult.text = "Olá $nome $sobrenome"
            Toast.makeText(
                applicationContext, "Olá $nome $sobrenome", Toast.LENGTH_LONG).show()
        }
    }
}