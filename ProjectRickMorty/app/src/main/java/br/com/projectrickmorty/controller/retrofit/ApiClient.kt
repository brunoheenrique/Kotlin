package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.controller.retrofit.services.CharacterService
import br.com.projectrickmorty.model.CharPosts
import retrofit2.Response

class ApiClient(
    private val rickAndMortyService: CharacterService
) {
    suspend fun getCharacterById(characterId:Int): SimpleResponse<CharPosts>{
        return safeApiCall { rickAndMortyService.getPosts(characterId) }
    }

    private inline fun <T> safeApiCall(apiCall:() -> Response<T>):SimpleResponse<T>{
        return try{
            SimpleResponse.success(apiCall.invoke())
        } catch (e:Exception){
            SimpleResponse.failure(e)
        }
    }
}