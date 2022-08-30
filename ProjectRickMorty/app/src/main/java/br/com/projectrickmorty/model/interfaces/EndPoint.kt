package br.com.projectrickmorty.model.interfaces

import br.com.projectrickmorty.model.Posts
import retrofit2.Call
import retrofit2.http.GET

interface EndPoint {

    @GET("posts")
    fun getPosts(): Call<List<Posts>>


}