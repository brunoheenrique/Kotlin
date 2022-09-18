package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.model.*
import retrofit2.Response

class SharedRepository {

    suspend fun getCharId(id: Int): CharPosts? {
        val request = NetworkUtils.charApiClient.getCharacterById(id)

        if (request.failed) {
            return null
        }

        if (!request.isSuccessful) {
            return null
        }

        return request.body
    }

    suspend fun getEpisodeId(id: Int): EpisodePosts? {
        val request = NetworkUtils.epApiClient.getEpisodeById(id)

        if (request.failed) {
            return null
        }

        if (!request.isSuccessful) {
            return null
        }

        return request.body
    }

    suspend fun getLocalId(id: Int): LocationPosts? {
        val request = NetworkUtils.localApiClient.getLocationById(id)

        if (request.failed) {
            return null
        }

        if (!request.isSuccessful) {
            return null
        }

        return request.body
    }

    suspend fun getCharList(page: Int): Response<CharList> {
        return NetworkUtils.charApi.getCharListPost(page)
    }

    suspend fun getEpisodeList(page: Int): Response<EpisodeList> {
        return NetworkUtils.epiApi.getEpisodeListPost(page)
    }

    suspend fun getLocationList(): Response<List<LocationPosts>> {
        return NetworkUtils.localApi.getLocalListPost()
    }

}