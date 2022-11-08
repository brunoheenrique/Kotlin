package br.com.mypokedex.retrofit.repository

import br.com.mypokedex.model.PokemonList
import br.com.mypokedex.retrofit.NetworkUtils
import br.com.mypokedex.retrofit.services.PokeService
import retrofit2.Response

class Repository {

    suspend fun getPokemons(page:Int):Response<PokemonList>{
        return NetworkUtils.pokeApi.getPokemonList(page)
    }
}