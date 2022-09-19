package br.com.projectrickmorty.view.activity

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel
import br.com.projectrickmorty.view.recycler.adapter.LocalListAdapter

class LocalListActivity : AppCompatActivity() {

    private var pagina: Int = 1
    private val viewModel = SharedViewModel()
    private val adapter by lazy { LocalListAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_list)

        val botaoProximaPagina = findViewById<ImageButton>(R.id.botao_locallist_proxima_pagina)
        val botaoPaginaAnterior = findViewById<ImageButton>(R.id.botao_locallist_pagina_anterior)
        val paginaTextView = findViewById<TextView>(R.id.locallist_pagina_textview)

        defineListenerBotoes(botaoProximaPagina, botaoPaginaAnterior)

        setupRecyclerView()

        viewModel.refreshLocalList(pagina)
        viewModel.listLocalLiveData.observe(this) {
            paginaTextView.text = pagina.toString()
            adapter.setData(it)
        }
    }

    private fun defineListenerBotoes(
        botaoProximaPagina: ImageButton,
        botaoPaginaAnterior: ImageButton
    ) {
        botaoProximaPagina.setOnClickListener {
            if (pagina < 7) {
                pagina += 1
                viewModel.refreshLocalList(pagina)
            }
        }

        botaoPaginaAnterior.setOnClickListener {
            if (pagina > 1) {
                pagina -= 1
                viewModel.refreshLocalList(pagina)
            }
        }
    }

    fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.local_list_recyclerview)
        recyclerView.adapter = adapter
    }
}