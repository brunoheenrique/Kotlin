package br.com.projectrickmorty.controller.retrofit.services

import br.com.projectrickmorty.model.LocationList
import br.com.projectrickmorty.model.LocationPosts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LocationService {

    @GET("location/{id}")
    suspend fun getLocalPost(@Path("id") id: Int): Response<LocationPosts>

    @GET("location")
    suspend fun getLocalListPost(@Query("page") page: Int): Response<LocationList>
}