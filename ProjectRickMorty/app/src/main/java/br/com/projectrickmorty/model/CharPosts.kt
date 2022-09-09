package br.com.projectrickmorty.model

data class CharPosts(
    val id : Int,
    val name : String,
    val status : String,
    val species : String,
    val gender : String,
    val origin : LocationData,
    val location : LocationData,
    val image : String,
    val episode:List<String>

)
