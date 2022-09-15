package br.com.projectrickmorty.controller.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.projectrickmorty.model.CharPosts
import br.com.projectrickmorty.model.EpisodePosts
import br.com.projectrickmorty.model.LocationPosts
import kotlinx.coroutines.launch
import retrofit2.Response

class SharedViewModel : ViewModel() {

    private val repository = SharedRepository()

    private val _characterByIdLiveData = MutableLiveData<CharPosts?>()
    val characterByIdLiveData: LiveData<CharPosts?> = _characterByIdLiveData

    private val _episodeByIdLiveData = MutableLiveData<EpisodePosts?>()
    val episodeByIdLiveData : LiveData<EpisodePosts?> = _episodeByIdLiveData

    private val _localByIdLiveData = MutableLiveData<LocationPosts?>()
    val localByIdLiveData : LiveData<LocationPosts?> = _localByIdLiveData

    val listEpisodeLiveData : MutableLiveData<Response<List<EpisodePosts>>> = MutableLiveData()
    val listCharacterLiveData = MutableLiveData<List<CharPosts>>()
    val listLocalLiveData : MutableLiveData<Response<List<LocationPosts>>> = MutableLiveData()

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

    fun refreshCharList(page:Int){
        viewModelScope.launch {
            val response = repository.getCharList(page)
            listCharacterLiveData.value = response.body()?.results
        }
    }

    fun refreshEpList(){
        viewModelScope.launch {
            val response = repository.getEpisodeList()
            listEpisodeLiveData.value = response
        }
    }

    fun refreshLocalList(){
        viewModelScope.launch {
            val response = repository.getLocationList()
            listLocalLiveData.value = response
        }
    }

}