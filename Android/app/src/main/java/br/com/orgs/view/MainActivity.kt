package br.com.orgs.view

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.orgs.R
import br.com.orgs.model.Produto
import br.com.orgs.view.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity: Activity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val titulo = findViewById<TextView>(R.id.main_titulo_textview)
//        val descricao = findViewById<TextView>(R.id.main_descricao_textview)
//        val preco = findViewById<TextView>(R.id.main_preco_textview)
//
//        titulo.text = "Cesta de Frutas"
//        descricao.text = "Laranja, manga e uva"
//        preco.text = "1909,99"

        val recyclerView = findViewById<RecyclerView>(R.id.main_recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(this, listOf(
            Produto("teste",
                    "descricao de teste",
                    BigDecimal(192.33)
            ),
            Produto("teste",
                "descricao de teste",
                BigDecimal(192.33)
            )
        ))
    }

}