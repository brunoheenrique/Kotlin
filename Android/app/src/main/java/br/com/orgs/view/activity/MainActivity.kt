package br.com.orgs.view.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.orgs.R
import br.com.orgs.model.Produto
import br.com.orgs.view.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.main_recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            this, listOf(
                Produto(
                    "teste",
                    "descricao de teste",
                    BigDecimal("192.33")
                ),
                Produto(
                    "outro teste",
                    "nada a declarar só sera caro",
                    BigDecimal("122234.33")
                )
            )
        )
        val fabAddProduto = findViewById<FloatingActionButton>(R.id.main_botao_add_produto)
        fabAddProduto.setOnClickListener{
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }


}