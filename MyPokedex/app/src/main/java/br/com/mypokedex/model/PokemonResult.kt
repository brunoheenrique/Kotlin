package br.com.mypokedex.model

data class PokemonResult(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val types: List<PokemonType>
)

