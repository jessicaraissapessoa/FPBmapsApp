package br.com.jessicaraissapessoa.fpbmapsapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.jessicaraissapessoa.fpbmapsapp.R
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.FragmentLocalizarBinding

class LocalizarFragment : Fragment() {

    private var _binding: FragmentLocalizarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View {
        _binding = FragmentLocalizarBinding.inflate(inflater, group, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPesquisar.setOnClickListener {
            handleSpinnerItemSelected(0)
        }

        binding.btnIdentificarSala.setOnClickListener {
            handleSpinnerItemSelected(1)
        }
    }

    private fun handleSpinnerItemSelected(position: Int) {
        when (position) {
            0 -> replaceFragment(ExibirResultadoPesquisaFragment())
            1 -> replaceFragment(ExibirResultadoIdentificarSalaFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}