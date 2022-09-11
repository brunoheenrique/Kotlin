package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.controller.retrofit.services.CharacterService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  NetworkUtils {

    private val retrofit:Retrofit=Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val rickAndMortyService:CharacterService by lazy {
        retrofit.create(CharacterService::class.java)
    }

    val apiClient = ApiClient(rickAndMortyService)

    val api: CharacterService by lazy {
        retrofit.create(CharacterService::class.java)
    }

}
