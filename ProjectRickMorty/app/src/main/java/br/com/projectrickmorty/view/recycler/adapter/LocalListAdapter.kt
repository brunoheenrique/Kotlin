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
import br.com.projectrickmorty.model.LocationPosts
import br.com.projectrickmorty.view.activity.LocalInfoActivity

class LocalListAdapter(
    private val context: Context
) : RecyclerView.Adapter<LocalListAdapter.ViewHolder>() {

    private var locallist: List<LocationPosts> = emptyList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val nomeLocal = itemView.findViewById<TextView>(R.id.item_local_nome)!!

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_local_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val local = locallist[position]
        val id = local.id
        holder.nomeLocal.text = local.name

        holder.itemView.setOnClickListener { v ->
            val intent = Intent(v.context, LocalInfoActivity::class.java)
            intent.putExtra("id", id)
            v.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = locallist.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newList: List<LocationPosts>) {
        locallist = newList
        notifyDataSetChanged()
    }

}
