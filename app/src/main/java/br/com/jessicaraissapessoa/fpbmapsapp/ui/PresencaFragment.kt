package br.com.jessicaraissapessoa.fpbmapsapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.FragmentPresencaBinding

class PresencaFragment : Fragment() {

    private var _binding: FragmentPresencaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View {
        _binding = FragmentPresencaBinding.inflate(inflater, group, false)

        return binding.root
    }

}