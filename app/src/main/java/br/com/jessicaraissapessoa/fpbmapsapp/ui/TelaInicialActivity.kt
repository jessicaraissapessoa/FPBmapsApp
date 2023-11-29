package br.com.jessicaraissapessoa.fpbmapsapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : AppCompatActivity() {

    private val binding by lazy { ActivityTelaInicialBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {
        binding.btnPerfil.setOnClickListener {
            startActivity(Intent(this, PerfilActivity::class.java))
        }
    }

}