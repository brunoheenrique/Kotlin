package br.com.projectrickmorty.view.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel
import br.com.projectrickmorty.view.recycler.adapter.EpisodeListAdapter

class EpisodeListActivity : AppCompatActivity() {

    private var viewModel = SharedViewModel()
    private val adapter by lazy { EpisodeListAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_episode_list)

        setupRecyclerView()

        viewModel.refreshEpList()
        viewModel.listEpisodeLiveData.observe(this) { response ->
            if (response.isSuccessful) {
                response.body()?.let { adapter.setData(it) }
            } else {
                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.episode_list_recyclerview)
        recyclerView.adapter = adapter
    }
}