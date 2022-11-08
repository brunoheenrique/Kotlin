package br.com.mypokedex.model

data class PokemonPost(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val types: List<PokemonType>
)

