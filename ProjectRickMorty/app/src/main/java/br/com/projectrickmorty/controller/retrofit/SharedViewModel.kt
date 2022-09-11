package br.com.projectrickmorty.controller.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.projectrickmorty.model.CharPosts
import kotlinx.coroutines.launch
import retrofit2.Response

class SharedViewModel : ViewModel() {

    private val repository = SharedRepository()

    private val _characterByIdLiveData = MutableLiveData<CharPosts?>()
    val characterByIdLiveData: LiveData<CharPosts?> = _characterByIdLiveData
    val listCharacterLiveData: MutableLiveData<Response<List<CharPosts>>> = MutableLiveData()

    fun refreshCharacter(charId: Int) {
        viewModelScope.launch {
            val response = repository.getCharId(charId)

            _characterByIdLiveData.postValue(response)
        }
    }

    fun refreshList(){
        viewModelScope.launch {
            val response = repository.getList()
            listCharacterLiveData.value = response
        }
    }

}