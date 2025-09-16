package com.vocefuma

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vocefuma.databinding.ActivityCalculoFumoBinding

class calculoFumo : AppCompatActivity() {
    private lateinit var binding: ActivityCalculoFumoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculoFumoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun calculoFumo(anosFumados: Int, cigarrosDiarios: Int): Int{
            val minutoPerdio: Int = 10

            val diasFumados: Int = ((anosFumados * 365) * cigarrosDiarios) * minutoPerdio

            val diasPerdidos: Int = diasFumados / (60 * 24)

            return diasPerdidos

        }

        val anosFumados = binding.anosFumados
        val cigarrosDiarios = binding.cigarrosDiarios
        val btncalculoFumo = binding.btnCalcular

        binding.btnCalcular.setOnClickListener {
            val cigarrosDiarios = cigarrosDiarios.text.toString()
            val anosFumados = anosFumados.text.toString()

            if (anosFumados.isEmpty() || cigarrosDiarios.isEmpty()) {
                Toast.makeText(this, "Preencha os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val cigarrosDiariosInt = cigarrosDiarios.toInt()
            val anosFumadosInt = anosFumados.toInt()

            val diasPerdidos = calculoFumo(anosFumadosInt, cigarrosDiariosInt)

            binding.resultadoFumante.text = "Uma pessoa fumando $cigarrosDiarios cigarros por dia por $anosFumados anos perdeu $diasPerdidos dias de vida"
        }


    }
}