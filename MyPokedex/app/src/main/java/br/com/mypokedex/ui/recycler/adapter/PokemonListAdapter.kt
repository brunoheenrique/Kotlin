package br.com.mypokedex.ui.recycler.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.mypokedex.R
import br.com.mypokedex.model.PokemonResult
import com.squareup.picasso.Picasso

class PokemonListAdapter : RecyclerView.Adapter<PokemonListAdapter.ViewHolder>() {

    private var pokelist = emptyList<PokemonResult>()

    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        var pokemonName = view.findViewById<TextView>(R.id.item_pokemon_name)!!
        var pokemonType1 = view.findViewById<TextView>(R.id.item_pokemon_type_1)!!
        var pokemonType2 = view.findViewById<TextView>(R.id.item_pokemon_type_2)!!
        var pokemonImage = view.findViewById<ImageView>(R.id.item_list_imageview)!!
        var typesSeparator = view.findViewById<TextView>(R.id.item_pokemon_separator)!!

        fun bindView(pokemon: PokemonResult) {
            pokemonName.text = pokemon.name
            pokemonType1.text = pokemon.types[0].toString()
            if(pokemon.types.size >1){
                typesSeparator.visibility = View.VISIBLE
                pokemonType2.visibility = View.VISIBLE
                pokemonType2.text = pokemon.types[1].toString()
            }else{
                typesSeparator.visibility = View.GONE
                pokemonType2.visibility = View.GONE
            }
            Picasso.get().load(pokemon.imageUrl).into(pokemonImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_pokemon_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = pokelist[position]
        holder.bindView(pokemon)
    }

    override fun getItemCount(): Int = pokelist.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newList: List<PokemonResult>) {
        pokelist = newList
        notifyDataSetChanged()
    }

}