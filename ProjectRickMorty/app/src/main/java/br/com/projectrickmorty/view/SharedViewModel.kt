package br.com.projectrickmorty.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.projectrickmorty.controller.retrofit.SharedRepository
import br.com.projectrickmorty.model.CharPosts
import br.com.projectrickmorty.model.EpisodePosts
import br.com.projectrickmorty.model.LocationPosts
import kotlinx.coroutines.launch

class SharedViewModel : ViewModel() {

    private val repository = SharedRepository()

    private val _characterByIdLiveData = MutableLiveData<CharPosts?>()
    val characterByIdLiveData: LiveData<CharPosts?> = _characterByIdLiveData

    private val _episodeByIdLiveData = MutableLiveData<EpisodePosts?>()
    val episodeByIdLiveData: LiveData<EpisodePosts?> = _episodeByIdLiveData

    private val _localByIdLiveData = MutableLiveData<LocationPosts?>()
    val localByIdLiveData: LiveData<LocationPosts?> = _localByIdLiveData

    val listEpisodeLiveData = MutableLiveData<List<EpisodePosts>>()
    val listCharacterLiveData = MutableLiveData<List<CharPosts>>()
    val listLocalLiveData = MutableLiveData<List<LocationPosts>>()

    fun refreshCharacter(charId: Int) {
        viewModelScope.launch {
            val response = repository.getCharId(charId)

            _characterByIdLiveData.postValue(response)
        }
    }

    fun refreshEpisode(episodeId: Int) {
        viewModelScope.launch {
            val response = repository.getEpisodeId(episodeId)

            _episodeByIdLiveData.postValue(response)
        }
    }

    fun refreshLocation(localId: Int) {
        viewModelScope.launch {
            val response = repository.getLocalId(localId)

            _localByIdLiveData.postValue(response)
        }
    }

    fun refreshCharList(page: Int) {
        viewModelScope.launch {
            val response = repository.getCharList(page)
            listCharacterLiveData.value = response.body()?.results
        }
    }

    fun refreshEpList(page: Int) {
        viewModelScope.launch {
            val response = repository.getEpisodeList(page)
            listEpisodeLiveData.value = response.body()?.results
        }
    }

    fun refreshLocalList(page: Int) {
        viewModelScope.launch {
            val response = repository.getLocationList(page)
            listLocalLiveData.value = response.body()?.results
        }
    }

}