package br.com.projectrickmorty.controller.retrofit.services

import br.com.projectrickmorty.model.EpisodeList
import br.com.projectrickmorty.model.EpisodePosts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EpisodeService {

    @GET("episode/{id}")
    suspend fun getEpisodePost(@Path("id") id: Int): Response<EpisodePosts>

    @GET("episode")
    suspend fun getEpisodeListPost(@Query("page") page: Int): Response<EpisodeList>

}