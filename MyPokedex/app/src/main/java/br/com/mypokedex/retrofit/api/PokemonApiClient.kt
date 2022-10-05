package br.com.mypokedex.retrofit.api

import br.com.mypokedex.model.PokemonPost
import br.com.mypokedex.retrofit.SimpleResponse
import br.com.mypokedex.retrofit.services.PokeService
import retrofit2.Response
import java.lang.Exception

class PokemonApiClient(
    private val pokemonService: PokeService){
    suspend fun getPokemonByID(pokeID:Int):SimpleResponse<PokemonPost>{
        return safeApiCall { pokemonService.getPokemonPost(pokeID) }
    }

    private inline fun <T> safeApiCall(apiCall:()-> Response<T>):SimpleResponse<T>{
        return try{
            SimpleResponse.success(apiCall.invoke())
        } catch(e:Exception){
            SimpleResponse.failure(e)
        }
    }
}
