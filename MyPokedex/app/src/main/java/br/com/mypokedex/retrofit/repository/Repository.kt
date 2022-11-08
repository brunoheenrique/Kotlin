package br.com.mypokedex.retrofit.repository

import br.com.mypokedex.model.PokemonList
import br.com.mypokedex.model.PokemonResult
import br.com.mypokedex.retrofit.NetworkUtils
import retrofit2.Response

class Repository {

    suspend fun getPokemonList(limit:Int):Response<PokemonList>{
        return NetworkUtils.pokeApi.getPokemonList(limit)
    }

    suspend fun getPokemonId(id: Int): PokemonResult? {
        val request = NetworkUtils.pokeApiClient.getPokemonByID(id)

        if (request.failed) {
            return null
        }

        if (!request.isSuccessful) {
            return null
        }

        return request.body
    }
}