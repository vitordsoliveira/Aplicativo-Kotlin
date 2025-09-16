package com.vocefuma

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vocefuma.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFumante.setOnClickListener {
            val intent = Intent(this, calculoFumo::class.java)
            startActivity(intent)

            binding.btnIntegrantes.setOnClickListener {
                val intent = Intent(this, integrantes::class.java)
                startActivity(intent)

            }

            binding.btnProva.setOnClickListener {
                val intent = Intent(this, prova::class.java)
                startActivity(intent)

            }
        }

    }

}