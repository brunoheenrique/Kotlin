package br.com.projectrickmorty.view.activity

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel
import br.com.projectrickmorty.view.recycler.adapter.CharacterListAdapter

class CharacterListActivity : AppCompatActivity() {

    private var pagina: Int = 1
    private var viewModel = SharedViewModel()
    private val adapter by lazy { CharacterListAdapter(this) }
    private val botao_proxima_pagina = findViewById<Button>(R.id.botao_charlist_proxima_pagina)
    private val botao_pagina_anterior = findViewById<Button>(R.id.botao_charlist_pagina_anterior)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)

        botao_proxima_pagina.setOnClickListener {
            pagina += 1
            viewModel.refreshCharList(pagina)
            viewModel.listCharacterLiveData.observe(this) {
                adapter.setData(it)
            }
        }

        botao_pagina_anterior.setOnClickListener {
            pagina-=1
            viewModel.refreshCharList(pagina)
            viewModel.listCharacterLiveData.observe(this) {
                adapter.setData(it)
            }
        }

        setupRecyclerView()

        viewModel.refreshCharList(pagina)
        viewModel.listCharacterLiveData.observe(this) {
            adapter.setData(it)
        }
    }

    fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.character_list_recyclerview)
        recyclerView.adapter = adapter
    }
}