package br.com.projectrickmorty.view.activity

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel
import br.com.projectrickmorty.view.recycler.adapter.EpisodeListAdapter

class EpisodeListActivity : AppCompatActivity() {

    private var pagina: Int = 1
    private var viewModel = SharedViewModel()
    private val adapter by lazy { EpisodeListAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_episode_list)

        val botaoProximaPagina = findViewById<ImageButton>(R.id.botao_eplist_proxima_pagina)
        val botaoPaginaAnterior = findViewById<ImageButton>(R.id.botao_eplist_pagina_anterior)
        val paginaTextView = findViewById<TextView>(R.id.eplist_pagina_textview)

        botaoProximaPagina.setOnClickListener {
            if (pagina < 3) {
                pagina += 1
                viewModel.refreshEpList(pagina)
            }
        }

        botaoPaginaAnterior.setOnClickListener {
            if (pagina > 1) {
                pagina -= 1
                viewModel.refreshEpList(pagina)
            }
        }

        setupRecyclerView()

        viewModel.refreshEpList(pagina)
        viewModel.listEpisodeLiveData.observe(this) {
            paginaTextView.text = pagina.toString()
            adapter.setData(it)
        }
    }

    fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.episode_list_recyclerview)
        recyclerView.adapter = adapter
    }
}