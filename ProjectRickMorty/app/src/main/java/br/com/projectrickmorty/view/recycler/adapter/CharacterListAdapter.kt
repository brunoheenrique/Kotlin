package br.com.projectrickmorty.view.recycler.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.model.CharPosts
import br.com.projectrickmorty.view.activity.CharacterInfoActivity

class CharacterListAdapter(
    private val context: Context
) : RecyclerView.Adapter<CharacterListAdapter.ViewHolder>() {

    private var charlist: List<CharPosts> = emptyList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var nameCharacter = view.findViewById<TextView>(R.id.item_character_name)!!
        var specieCharacter = view.findViewById<TextView>(R.id.item_character_specie)!!
        var originCharacter = view.findViewById<TextView>(R.id.item_character_origin)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_character_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val character = charlist[position]
        val id = charlist[position].id
        holder.nameCharacter.text = character.name
        holder.specieCharacter.text = character.species
        holder.originCharacter.text = character.origin.name

        holder.itemView.setOnClickListener { v ->
            val intent = Intent(v.context,CharacterInfoActivity::class.java )
            intent.putExtra("id",id)
            v.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = charlist.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newList: List<CharPosts>) {
        charlist = newList
        notifyDataSetChanged()
    }

}


