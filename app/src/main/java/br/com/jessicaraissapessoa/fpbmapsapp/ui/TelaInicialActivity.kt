package br.com.jessicaraissapessoa.fpbmapsapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import br.com.jessicaraissapessoa.fpbmapsapp.R
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : AppCompatActivity() {

    private val binding by lazy { ActivityTelaInicialBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupListeners()

        val navController = findNavController(R.id.nav_host_fragment)
        setupWithNavController(binding.bottomNavigation, navController)
    }

    private fun setupListeners() {
        binding.btnPerfil.setOnClickListener {
            startActivity(Intent(this, PerfilActivity::class.java))
        }
    }

}