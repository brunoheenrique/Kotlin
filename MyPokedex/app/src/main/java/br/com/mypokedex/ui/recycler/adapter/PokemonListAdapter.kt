package br.com.mypokedex.ui.recycler.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.mypokedex.databinding.ItemPokemonListBinding
import br.com.mypokedex.model.PokemonResult
import com.squareup.picasso.Picasso

class PokemonListAdapter: RecyclerView.Adapter<PokemonListAdapter.ViewHolder>() {

    private var pokelist = emptyList<PokemonResult>()

    class ViewHolder(val binding: ItemPokemonListBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bindView(pokemon: PokemonResult){
                binding.itemPokemonName.text = pokemon.name
                binding.itemPokemonType1.text = pokemon.types[0].toString()
                if(pokemon.types.size >1) {
                    binding.itemPokemonType2.visibility = View.VISIBLE
                    binding.itemPokemonType2.text = pokemon.types[1].toString()
                }else{
                    binding.itemPokemonType2.visibility = View.GONE
                }
                Picasso.get().load(pokemon.imageUrl).into(binding.itemListImageview)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPokemonListBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
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