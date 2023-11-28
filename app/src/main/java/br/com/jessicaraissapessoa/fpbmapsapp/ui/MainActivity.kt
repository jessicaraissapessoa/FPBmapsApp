package br.com.jessicaraissapessoa.fpbmapsapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.icLogo

        setupListeners()
    }

    private fun setupListeners() {
        binding.btnEntrar.setOnClickListener {
            Log.d(TAG, "Botão Entrar clicado. Iniciando TelaInicialActivity.")
            startActivity(Intent(this, TelaInicialActivity::class.java))
            Log.d(TAG, "foi")
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}