package br.com.projectrickmorty.view.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel
import br.com.projectrickmorty.model.CharPosts
import br.com.projectrickmorty.view.recycler.adapter.CharacterListAdapter

class CharacterListActivity : AppCompatActivity() {

    private val charlist = emptyList<CharPosts>()
    private val viewModel = SharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)

        viewModel.refreshCharacter(3)
        viewModel.characterByIdLiveData.observe(this) { response ->
            if (response == null) {
                Toast.makeText(
                    this@CharacterListActivity,
                    "Chamada de API falhou!",
                    Toast.LENGTH_SHORT
                ).show()
                return@observe
            }

            val recyclerView = findViewById<RecyclerView>(R.id.character_list_recyclerview)
            recyclerView.adapter = CharacterListAdapter(this)

            val intent = Intent(this, CharacterInfoActivity::class.java)
            startActivity(intent)

        }
    }
}