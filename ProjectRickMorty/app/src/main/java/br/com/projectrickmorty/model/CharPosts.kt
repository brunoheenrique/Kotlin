package br.com.projectrickmorty.model

import com.google.gson.annotations.SerializedName

data class CharPosts(
    @SerializedName("Id")
    var id : Int,
    @SerializedName("name")
    var name : String,
    @SerializedName("status")
    var status : String,
    @SerializedName("species")
    var species : String,
    @SerializedName("type")
    var type : String,
    @SerializedName("gender")
    var gender : String,
    @SerializedName("origin")
    var origin : Any,
    @SerializedName("location")
    var location : Any,
    @SerializedName("image")
    var image : String

)
