package br.com.projectrickmorty.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.model.Characters
import br.com.projectrickmorty.view.recycler.adapter.CharacterListAdapter

class CharacterListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)

        val recyclerView = findViewById<RecyclerView>(R.id.character_list_recyclerview)
        recyclerView.adapter = CharacterListAdapter(this, listOf(
            Characters("Rick Sanchez", "Human", "Male"),
            Characters("Morty Smith", "Human", "Male"),
            Characters("Jerry Smith","Human", "Male"),
            Characters("Betty Smith","Human", "Female"),
            Characters("Summer Smith", "Human", "Female")
        ))

    }
}