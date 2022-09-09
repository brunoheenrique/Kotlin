package br.com.projectrickmorty.controller.retrofit

import br.com.projectrickmorty.controller.retrofit.services.CharacterService
import br.com.projectrickmorty.model.CharPosts
import retrofit2.Response

class ApiClient(
    private val rickAndMortyService: CharacterService
) {
    suspend fun getCharacterById(characterId:Int): Response<CharPosts>{
        return rickAndMortyService.getPosts(characterId)
    }

}