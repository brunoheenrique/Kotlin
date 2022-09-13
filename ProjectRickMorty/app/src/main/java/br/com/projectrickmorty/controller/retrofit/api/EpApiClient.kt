package br.com.projectrickmorty.controller.retrofit.api

import br.com.projectrickmorty.controller.retrofit.SimpleResponse
import br.com.projectrickmorty.controller.retrofit.services.EpisodeService
import br.com.projectrickmorty.model.EpisodePosts
import retrofit2.Response

class EpApiClient(
    private val rickAndMortyService: EpisodeService) {
    suspend fun getEpisodeById(episodeId:Int): SimpleResponse<EpisodePosts> {
        return safeApiCall { rickAndMortyService.getEpisodePost(episodeId) }
    }

    private inline fun <T> safeApiCall(apiCall:() -> Response<T>): SimpleResponse<T> {
        return try{
            SimpleResponse.success(apiCall.invoke())
        } catch (e:Exception){
            SimpleResponse.failure(e)
        }
    }

}