package com.example.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.menurestaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val precoPao = 0.5
    private val precoCafe = 1.0
    private val precoPresunto = 2.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRealizarPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)
            i.putExtra("quant_cafe", binding.editQuantidadeCafe.text.toString())
            i.putExtra("quant_presunto", binding.editQuantidadePresunto.text.toString())
            i.putExtra("quant_pao", binding.editQuantidadePao.text.toString())
            i.putExtra("preco_cafe", precoCafe)
            i.putExtra("preco_presunto", precoPresunto)
            i.putExtra("preco_pao", precoPao)
            startActivity(i)
        }
        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked){
                binding.editQuantidadeCafe.setText("1")
                binding.textPrecoCafe.visibility = View.VISIBLE
            }else {
                binding.editQuantidadeCafe.setText("0")
                binding.textPrecoCafe.visibility = View.GONE
            }
        }
        binding.checkPresunto.setOnClickListener {
            if (binding.checkPresunto.isChecked){
                binding.editQuantidadePresunto.setText("1")
                binding.textPrecoPresunto.visibility = View.VISIBLE
            }else {
                binding.editQuantidadePresunto.setText("0")
                binding.textPrecoPresunto.visibility = View.GONE
            }
        }
        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked){
                binding.editQuantidadePao.setText("1")
                binding.textPrecoPao.visibility = View.VISIBLE
            }else {
                binding.editQuantidadePao.setText("0")
                binding.textPrecoPao.visibility = View.GONE
            }
        }

    }
}