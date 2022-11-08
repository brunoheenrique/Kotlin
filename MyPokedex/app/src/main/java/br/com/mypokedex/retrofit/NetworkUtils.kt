package br.com.mypokedex.retrofit

import br.com.mypokedex.retrofit.api.PokemonApiClient
import br.com.mypokedex.retrofit.services.PokeService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkUtils {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://pokeapi.co/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val pokeService: PokeService by lazy{
        retrofit.create(PokeService::class.java)
    }

    // Utilizar na parte de detalhes para alterar ID
    val pokeApiClient = PokemonApiClient(pokeService)

    // Utilizar para listas
    val pokeApi: PokeService by lazy {
        retrofit.create(PokeService::class.java)
    }
}