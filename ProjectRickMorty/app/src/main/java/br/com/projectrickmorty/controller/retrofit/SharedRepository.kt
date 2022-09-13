package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.model.CharPosts
import br.com.projectrickmorty.model.EpisodePosts
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

    suspend fun getEpisodeId(id: Int): EpisodePosts? {
        val request = NetworkUtils.epApiClient.getEpisodeById(id)

        if(request.failed){
            return null
        }

        if (!request.isSuccessful){
            return null
        }

        return request.body
    }

    suspend fun getCharList(): Response<List<CharPosts>>{
        return NetworkUtils.charApi.getCharListPost()
    }

    suspend fun getEpisodeList(): Response<List<EpisodePosts>>{
        return NetworkUtils.epiApi.getEpisodeListPost()
    }

}