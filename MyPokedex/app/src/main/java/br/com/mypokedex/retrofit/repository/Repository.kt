package br.com.mypokedex.retrofit.repository

import br.com.mypokedex.model.PokemonList
import br.com.mypokedex.model.PokemonPost
import br.com.mypokedex.retrofit.NetworkUtils
import br.com.mypokedex.retrofit.services.PokeService
import retrofit2.Response

class Repository {

    suspend fun getPokemonId(id: Int): PokemonPost? {
        val request = NetworkUtils.pokeApiClient.getPokemonByID(id)

        if (request.failed) {
            return null
        }

        if (!request.isSuccessful) {
            return null
        }

        return request.body
    }

    suspend fun getPokemonList(page:Int):Response<PokemonList>{
        return NetworkUtils.pokeApi.getPokemonList(page)
    }
}