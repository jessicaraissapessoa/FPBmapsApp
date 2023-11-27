package br.com.jessicaraissapessoa.fpbmapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupListeners()

        val navController = findNavController(R.id.nav_host_fragment)
    }

    private fun setupListeners() {
        TODO("Not yet implemented")
    }
}