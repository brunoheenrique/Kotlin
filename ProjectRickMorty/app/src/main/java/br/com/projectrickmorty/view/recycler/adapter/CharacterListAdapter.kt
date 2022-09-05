package br.com.projectrickmorty.view.recycler.adapter

import android.annotation.SuppressLint
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

    private var charlist = emptyList<CharPosts>()

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view) {

        var name_character = view.findViewById<TextView>(R.id.item_character_name)
        var specie_character = view.findViewById<TextView>(R.id.item_character_name)
        var gender_character = view.findViewById<TextView>(R.id.item_character_name)

        fun bind(character: CharPosts) {
            name_character.text = character.name
            specie_character.text = character.species
            gender_character.text = character.gender
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_character_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val character = charlist[position]
        holder.bind(character)
    }

    override fun getItemCount(): Int = charlist.size

    @SuppressLint("NotifyDataSetChanged")
    fun setCharacters(characters: List<CharPosts>){
        charlist = characters
        notifyDataSetChanged()
    }

}


