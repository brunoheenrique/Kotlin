package br.com.mypokedex.ui.recycler.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.mypokedex.R
import br.com.mypokedex.model.PokemonPost
import com.squareup.picasso.Picasso

class PokemonListAdapter(
    private val context: Context
) : RecyclerView.Adapter<PokemonListAdapter.ViewHolder>() {

    private var pokelist = emptyList<PokemonPost>()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindView(item:PokemonPost) = with(itemView){
            val imagePokemon = findViewById<ImageView>(R.id.item_list_imageview)
            val namePokemon = findViewById<TextView>(R.id.item_pokemon_name)
            val type1Pokemon = findViewById<TextView>(R.id.item_pokemon_type_1)
            val type2Pokemon = findViewById<TextView>(R.id.item_pokemon_type_2)

            // TODO: Load image with Glide

            namePokemon.text = item.name
            type1Pokemon.text = item.types[0].name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_pokemon_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = pokelist[position]
        holder.bindView(pokemon)
    }

    override fun getItemCount(): Int = pokelist.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newList: List<PokemonPost>){
        pokelist = newList
        notifyDataSetChanged()
    }

}