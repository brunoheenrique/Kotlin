package br.com.orgs.view.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.orgs.R
import br.com.orgs.model.Produto

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.main_titulo_textview)
            val descricao = itemView.findViewById<TextView>(R.id.main_descricao_textview)
            val valor = itemView.findViewById<TextView>(R.id.main_preco_textview)
            nome.text = produto.nome
            descricao.text = produto.descricao
            valor.text = produto.valor.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = produtos.size

}
