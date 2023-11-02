package com.example.bundleextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundleextras.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val bundle = i.extras

        binding.buttonOk.setOnClickListener {

            val numero = binding.editNumero.text.toString().trim().toInt()

            val i = Intent(this, ActivityMain2Binding::class.java)
            if (bundle != null) {
                i.putExtras(bundle)
            }
            i.putExtra("numero2", numero)
            startActivity(i)
        }
    }
}