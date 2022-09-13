package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.controller.retrofit.services.CharacterService
import br.com.projectrickmorty.controller.retrofit.services.EpisodeService
import br.com.projectrickmorty.controller.retrofit.services.LocationService
import br.com.projectrickmorty.model.LocationPosts
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object NetworkUtils {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val charService: CharacterService by lazy {
        retrofit.create(CharacterService::class.java)
    }

    private val episodeService: EpisodeService by lazy {
        retrofit.create(EpisodeService::class.java)
    }

    private val locationService: LocationService by lazy {
        retrofit.create(LocationService::class.java)
    }

    val charApiClient = CharApiClient(charService)
    val epApiClient = EpApiClient(episodeService)
    val localApiClient = LocalApiClient(locationService)

    val charApi: CharacterService by lazy {
        retrofit.create(CharacterService::class.java)
    }

    val epiApi: EpisodeService by lazy {
        retrofit.create(EpisodeService::class.java)
    }

    val localApi: LocationService by lazy {
        retrofit.create(LocationService::class.java)
    }

}
