package br.com.mypokedex.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.mypokedex.databinding.FragmentPokemonListBinding
import br.com.mypokedex.ui.SharedViewModel
import br.com.mypokedex.ui.recycler.adapter.PokemonListAdapter

class PokemonListFragment : Fragment() {

    private var limite: Int = 151
    private var viewModel = SharedViewModel()
    private var _binding: FragmentPokemonListBinding? = null
    private val binding get() = _binding!!
    private val adapter by lazy{PokemonListAdapter()}

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.getPokemons(limite)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.listPokemons.observe(viewLifecycleOwner) { response ->
            if (response.isSuccessful) {
                adapter.setData(response.body()!!.results)
                Log.d("Result", response.body()!!.results.toString())
            } else {
                Log.d("ResultError", response.code().toString())
            }
        }
        binding.apply {
            fragmentPokemonListRecyclerview.adapter = adapter
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPokemonListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}