package br.com.projectrickmorty.controller.retrofit.services

import br.com.projectrickmorty.model.CharPosts
import br.com.projectrickmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET

interface CharacterService {

    @GET("api/character")
    fun getPosts(): Call<List<CharPosts>>




}