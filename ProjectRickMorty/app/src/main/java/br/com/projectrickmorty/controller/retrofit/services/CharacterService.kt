package br.com.projectrickmorty.controller.retrofit.services

import br.com.projectrickmorty.model.CharPosts
import retrofit2.Call
import retrofit2.http.GET

interface CharacterService {

    @GET("characters")
    fun getPosts(): Call<List<CharPosts>>


}