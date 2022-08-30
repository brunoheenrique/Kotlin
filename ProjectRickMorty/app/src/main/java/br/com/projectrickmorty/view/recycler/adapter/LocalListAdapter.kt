package br.com.projectrickmorty.view.recycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.model.testemodel.Locals

class LocalListAdapter(
    private val context: Context,
    private val locais: List<Locals>
) : RecyclerView.Adapter<LocalListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(local: Locals) {
            val nome = itemView.findViewById<TextView>(R.id.item_local_nome)
            nome.text = local.nome
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_local_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val local = locais[position]
        holder.bind(local)
    }

    override fun getItemCount(): Int = locais.size

}
