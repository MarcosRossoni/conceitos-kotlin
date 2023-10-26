package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginapp.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val login = binding.editUsername.text.toString().trim()
            val senha = binding.editSenha.text.toString().trim()

            if (login.equals("user") && senha.equals("pass")){
                Toast.makeText(applicationContext, "Login OK", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Login Invalido", Toast.LENGTH_SHORT).show()
            }

            binding.editUsername.setText("")
            binding.editSenha.setText("")

        }
    }
}