package br.com.projectrickmorty.view.recycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.model.CharPosts

class CharacterListAdapter(
    private val context: Context
) : RecyclerView.Adapter<CharacterListAdapter.ViewHolder>() {

    private val characters = emptyList<CharPosts>()

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view) {

        fun bind(character: CharPosts) {
            val name = itemView.findViewById<TextView>(R.id.item_character_name)
            name.text = character.name
            val species = itemView.findViewById<TextView>(R.id.item_character_specie)
            species.text = character.species
            val gender = itemView.findViewById<TextView>(R.id.item_character_gender)
            gender.text = character.gender
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_character_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val character = characters[position]
        holder.bind(character)
    }

    override fun getItemCount(): Int = characters.size

}


