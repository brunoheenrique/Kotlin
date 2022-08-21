package br.com.orgs.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.orgs.R
import br.com.orgs.controller.dao.ProdutosDao
import br.com.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        val botaoSalvar =
            findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.formulario_botao_salvar)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.formulario_campo_nome)
            val campoDescricao = findViewById<EditText>(R.id.formulario_campo_descricao)
            val campoValor = findViewById<EditText>(R.id.formulario_campo_valor)

            val nome = campoNome.text.toString()
            val descricao = campoDescricao.text.toString()
            val valorEmTexto = campoValor.text.toString()
            val valor = if (valorEmTexto.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(valorEmTexto)
            }

            val produtoNovo = Produto(
                nome,
                descricao,
                valor
            )

            val dao = ProdutosDao()
            dao.adiciona(produtoNovo)

        }
    }

}