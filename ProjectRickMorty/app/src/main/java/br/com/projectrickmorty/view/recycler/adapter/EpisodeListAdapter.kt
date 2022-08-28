package br.com.projectrickmorty.view.recycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.model.Episodes

class EpisodeListAdapter(
    private val context: Context,
    private val episodes: List<Episodes>
) : RecyclerView.Adapter<EpisodeListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(episode: Episodes) {
            val nome = itemView.findViewById<TextView>(R.id.item_episode_list_name_textview)
            nome.text = episode.nome
            val code = itemView.findViewById<TextView>(R.id.item_episode_list_code_textview)
            code.text = episode.codigo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.activity_episode_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val episode = episodes[position]
        holder.bind(episode)
    }

    override fun getItemCount(): Int = episodes.size

}
