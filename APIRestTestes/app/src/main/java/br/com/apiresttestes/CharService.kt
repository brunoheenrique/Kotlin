package br.com.apiresttestes

import retrofit2.Call
import retrofit2.http.GET

interface CharService {

    @GET("character/1")
    fun getCharById(): Call <Modelo>

}