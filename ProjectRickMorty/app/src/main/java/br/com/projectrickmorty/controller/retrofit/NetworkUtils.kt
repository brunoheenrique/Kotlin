package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.controller.retrofit.services.CharacterService
import br.com.projectrickmorty.controller.retrofit.services.EpisodeService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  NetworkUtils {

    private val retrofit:Retrofit=Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val charService:CharacterService by lazy {
        retrofit.create(CharacterService::class.java)
    }

    private val episodeService:EpisodeService by lazy {
        retrofit.create(EpisodeService::class.java)
    }

    val charApiClient = CharApiClient(charService)
    val epApiClient = EpApiClient(episodeService)


    val charApi: CharacterService by lazy {
        retrofit.create(CharacterService::class.java)
    }

    val epiApi: EpisodeService by lazy {
        retrofit.create(EpisodeService::class.java)
    }

}
