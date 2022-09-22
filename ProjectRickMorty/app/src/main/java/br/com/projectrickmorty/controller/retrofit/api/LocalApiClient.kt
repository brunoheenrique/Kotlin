package br.com.projectrickmorty.controller.retrofit.api

import br.com.projectrickmorty.controller.retrofit.services.LocationService
import br.com.projectrickmorty.model.LocationPosts
import retrofit2.Response

class LocalApiClient(
    private val rickAndMortyService: LocationService) {
    suspend fun getLocationById(localId:Int): SimpleResponse<LocationPosts> {
        return safeApiCall { rickAndMortyService.getLocalPost(localId) }
    }

    private inline fun <T> safeApiCall(apiCall:() -> Response<T>): SimpleResponse<T> {
        return try{
            SimpleResponse.success(apiCall.invoke())
        } catch (e:Exception){
            SimpleResponse.failure(e)
        }
    }

}