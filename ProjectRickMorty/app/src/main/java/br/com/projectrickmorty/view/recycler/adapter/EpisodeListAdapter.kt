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
import br.com.projectrickmorty.model.EpisodePosts
import br.com.projectrickmorty.view.activity.EpisodeInfoActivity

class EpisodeListAdapter(
    private val context: Context
) : RecyclerView.Adapter<EpisodeListAdapter.ViewHolder>() {

    private var episodelist :List<EpisodePosts> = emptyList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var epName = view.findViewById<TextView>(R.id.item_episode_list_name_textview)!!
        var epCode = view.findViewById<TextView>(R.id.item_episode_list_code_textview)!!

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_episode_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val episode = episodelist[position]
        val id = episode.id
        holder.epName.text = episode.name
        holder.epCode.text = episode.episode

        holder.itemView.setOnClickListener { v ->
            val intent = Intent(v.context, EpisodeInfoActivity::class.java )
            intent.putExtra("id",id)
            v.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = episodelist.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newList: List<EpisodePosts>) {
        episodelist = newList
        notifyDataSetChanged()
    }

}
