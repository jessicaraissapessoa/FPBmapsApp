package br.com.jessicaraissapessoa.fpbmapsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {
        TODO("Not yet implemented")
    }
}