package br.com.projectrickmorty.view.activity

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel
import br.com.projectrickmorty.view.recycler.adapter.CharacterListAdapter

class CharacterListActivity : AppCompatActivity() {

    private var pagina: Int = 1
    private var viewModel = SharedViewModel()
    private val adapter by lazy { CharacterListAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)

        val botaoProximaPagina = findViewById<ImageButton>(R.id.botao_charlist_proxima_pagina)
        val botaoPaginaAnterior = findViewById<ImageButton>(R.id.botao_charlist_pagina_anterior)
        val paginaTextview = findViewById<TextView>(R.id.charlist_pagina_textview)

        botaoProximaPagina.setOnClickListener {
            pagina += 1
            viewModel.refreshCharList(pagina)
        }

        botaoPaginaAnterior.setOnClickListener {
            pagina-=1
            viewModel.refreshCharList(pagina)
        }

        setupRecyclerView()

        viewModel.refreshCharList(pagina)
        viewModel.listCharacterLiveData.observe(this) {
            paginaTextview.text = pagina.toString()
            adapter.setData(it)
        }
    }

    fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.character_list_recyclerview)
        recyclerView.adapter = adapter
    }
}