package br.com.projectrickmorty.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.model.testemodel.Episodes
import br.com.projectrickmorty.view.recycler.adapter.EpisodeListAdapter

class EpisodeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_episode_list)

        val recyclerView = findViewById<RecyclerView>(R.id.episode_list_recyclerview)
        recyclerView.adapter = EpisodeListAdapter(this, listOf(
            Episodes(nome = "Piloto","S01E01"),
            Episodes(nome = "Lawnmower Dog","S01E02"),
            Episodes(nome = "Anatomy Park","S01E03"),
            Episodes(nome = "M. Night Shaym-Aliens!","S01E04"),
            Episodes(nome = "Meeseeks and Destroy","S01E05"),
            Episodes(nome = "Rick Potion #9","S01E06"),
            Episodes(nome = "Raising Gazorpazorp","S01E07"),
            Episodes(nome = "Rixty Minutes","S01E08"),
            Episodes(nome = "Something Ricked This Way Comes","S01E09"),
            Episodes(nome = "Close Rick-counters of the Rick Kind","S01E10"),
            Episodes(nome = "Ricksy Business","S01E11"),
            Episodes(nome = "A Rickle in Time","S02E01"),
            Episodes(nome = "Mortynight Run","S02E02")
        ))

    }
}