package br.com.jessicaraissapessoa.fpbmapsapp.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.ActivityPerfilBinding

class PerfilActivity : AppCompatActivity() {

    private val binding by lazy { ActivityPerfilBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {

        binding.btnVoltar.setOnClickListener {
            startActivity(Intent(this, TelaInicialActivity::class.java))
        }

        binding.btnUlifeAluno.setOnClickListener {
            acessarUlife("https://aluno.fpb.edu.br/SOL/aluno/index.php/index/seguranca/dev/instituicao/136")
        }

        binding.btnSalasVirtuais.setOnClickListener {
            acessarUlife("https://www.ulife.com.br/Login.aspx?ReturnUrl=%2fStudentHome#pageIndex=1")
        }

        binding.btnLogout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun acessarUlife(url : String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}