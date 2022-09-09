package br.com.projectrickmorty.controller.retrofit.services

import br.com.projectrickmorty.model.CharPosts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("character/{id}")
    suspend fun getPosts(@Path("id") id:Int): Response<CharPosts>




}