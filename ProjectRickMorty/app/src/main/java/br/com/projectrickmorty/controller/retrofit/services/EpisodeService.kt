package br.com.projectrickmorty.controller.retrofit.services

import br.com.projectrickmorty.model.EpisodePosts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EpisodeService {

    @GET("episode/{id}")
    suspend fun getEpisodePost(@Path("id") id:Int):Response<EpisodePosts>

    @GET("episode/[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30" +
            "31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51]")
    suspend fun getEpisodeListPost():Response<List<EpisodePosts>>

}