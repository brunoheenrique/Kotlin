package br.com.projectrickmorty.controller.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.projectrickmorty.model.CharPosts
import kotlinx.coroutines.launch

class SharedViewModel : ViewModel() {

    private val repository = SharedRepository()

    private val _characterByIdLiveData = MutableLiveData<CharPosts?>()
    val characterByIdLiveData: LiveData<CharPosts?> = _characterByIdLiveData

    fun refreshCharacter(charId : Int){
        viewModelScope.launch {
            val response = repository.getCharId(charId)

            _characterByIdLiveData.postValue(response)
        }
    }
}