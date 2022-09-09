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
    private val context: Context,
    private val charlist: List<CharPosts>
) : RecyclerView.Adapter<CharacterListAdapter.ViewHolder>() {



    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var nameCharacter = view.findViewById<TextView>(R.id.item_character_name)!!
        private var specieCharacter = view.findViewById<TextView>(R.id.item_character_name)!!
        private var genderCharacter = view.findViewById<TextView>(R.id.item_character_name)!!

        fun bind(character: CharPosts) {
            nameCharacter.text = character.name
            specieCharacter.text = character.species
            genderCharacter.text = character.gender
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_character_list, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val character = charlist[position]
        holder.bind(character)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = charlist.size

}


