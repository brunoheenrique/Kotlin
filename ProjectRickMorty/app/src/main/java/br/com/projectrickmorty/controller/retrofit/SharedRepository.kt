package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.model.CharPosts

class SharedRepository {

    suspend fun getCharId(id: Int): CharPosts? {
        val request = NetworkUtils.apiClient.getCharacterById(id)

        if(request.failed){
            return null
        }

        if (!request.isSuccessful){
            return null
        }

        return request.body
    }
}