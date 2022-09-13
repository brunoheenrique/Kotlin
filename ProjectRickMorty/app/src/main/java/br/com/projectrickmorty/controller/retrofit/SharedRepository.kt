package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.model.CharPosts
import retrofit2.Response

class SharedRepository {

    suspend fun getCharId(id: Int): CharPosts? {
        val request = NetworkUtils.charApiClient.getCharacterById(id)

        if(request.failed){
            return null
        }

        if (!request.isSuccessful){
            return null
        }

        return request.body
    }

    suspend fun getCharList(): Response<List<CharPosts>>{
        return NetworkUtils.api.getCharListPost()
    }

}