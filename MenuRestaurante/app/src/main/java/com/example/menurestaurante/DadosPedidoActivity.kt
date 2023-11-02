package com.example.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menurestaurante.databinding.ActivityDadosPedidoBinding

class DadosPedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDadosPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val quantCafe = i.getStringExtra("quant_cafe").toString().toInt()
        val quantPresunto = i.getStringExtra("quant_presunto").toString().toInt()
        val quantPao = i.getStringExtra("quant_pao").toString().toInt()
        val vlCafe = i.getDoubleExtra("preco_cafe", 0.0)
        val vlPresunto = i.getDoubleExtra("preco_presunto", 0.0)
        val vlPao = i.getDoubleExtra("preco_pao", 0.0)

        val texto = "Resumo do pedido: \n" +
        "Café: $quantCafe Preço: R$ ${quantCafe*vlCafe}\n "+
        "Pão: $quantPao Preço: R$ ${quantPao*vlPao}\n " +
        "Presunto: $quantPresunto Preço: R$ ${quantPresunto*vlPresunto}\n "

        binding.textResumo.text = texto
    }
}