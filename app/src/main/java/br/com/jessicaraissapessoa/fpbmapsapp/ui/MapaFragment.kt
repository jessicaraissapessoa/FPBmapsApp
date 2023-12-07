package br.com.jessicaraissapessoa.fpbmapsapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import br.com.jessicaraissapessoa.fpbmapsapp.R
import br.com.jessicaraissapessoa.fpbmapsapp.databinding.FragmentMapaBinding

class MapaFragment  : Fragment() {

    private var _binding: FragmentMapaBinding? = null // set do binding (só seta uma vez)
    private val binding get() = _binding!! //get do binding (recupera)

    lateinit var spinner: Spinner

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View {
        _binding = FragmentMapaBinding.inflate(inflater, group, false)

        spinner = binding.spinner
        val andares = arrayOf("Térreo", "1º andar", "2º andar")
        spinner.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, andares)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                handleSpinnerItemSelected(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TerreoFragment()
            }
        }

        return binding.root
    }

    private fun handleSpinnerItemSelected(position: Int) {
        when (position) {
            0 -> replaceFragment(TerreoFragment())
            1 -> replaceFragment(PrimeiroAndarFragment())
            2 -> replaceFragment(SegundoAndarFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container2, fragment)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}