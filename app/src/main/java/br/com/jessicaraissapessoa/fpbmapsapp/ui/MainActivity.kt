package br.com.jessicaraissapessoa.fpbmapsapp.ui

import android.content.Intent
import android.os.Bundle
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
            startActivity(Intent(this, TelaInicialActivity::class.java))
        }
    }
}