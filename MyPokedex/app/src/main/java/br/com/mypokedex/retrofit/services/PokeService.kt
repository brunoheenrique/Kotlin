package br.com.mypokedex.retrofit.services

import br.com.mypokedex.model.PokemonList
import br.com.mypokedex.model.PokemonPost
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeService {

    @GET("pokemon/{id}")
    suspend fun getPokemonPost(@Path("id") id:Int): Response<PokemonPost>

    @GET("pokemon")
    suspend fun getPokemonList(@Query("page") page:Int):Response<PokemonList>
}