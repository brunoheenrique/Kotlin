package br.com.projectrickmorty.controller.epoxy

import br.com.projectrickmorty.model.CharPosts
import com.airbnb.epoxy.EpoxyController

class CharListEpoxyController : EpoxyController() {

    var isLoading: Boolean = true
        set(value) {
            field = value
            if (field) {
                requestModelBuild()
            }
        }

    var characterResponse: CharPosts? = null
        set(value){
            field = value
            if(field != null){
                isLoading = false
                requestModelBuild()
            }
        }

    override fun buildModels() {

    }
}