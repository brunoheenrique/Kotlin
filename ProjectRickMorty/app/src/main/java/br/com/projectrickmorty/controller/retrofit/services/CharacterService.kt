package br.com.projectrickmorty.controller.retrofit.services

import br.com.projectrickmorty.model.CharPosts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterService {

    @GET("character/{id}")
    suspend fun getPost(@Path("id") id: Int): Response<CharPosts>

    @GET("character")
    suspend fun getListPost():Response<List<CharPosts>>


}