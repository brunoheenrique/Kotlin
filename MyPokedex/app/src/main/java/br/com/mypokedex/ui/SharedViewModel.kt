package br.com.mypokedex.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.mypokedex.model.PokemonList
import br.com.mypokedex.retrofit.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class SharedViewModel(private val repository: Repository):ViewModel() {

    var listPokemons = MutableLiveData<Response<PokemonList>>()

    fun getPokemons(page:Int){
        viewModelScope.launch {
            val pokemons = repository.getPokemonList(page)
            listPokemons.value = pokemons
        }
    }
}