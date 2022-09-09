package br.com.apiresttestes

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharService {

    @GET("character/{character-id}")
    fun getCharById(@Path("character-id") characterId: Int): Call<Modelo>

}