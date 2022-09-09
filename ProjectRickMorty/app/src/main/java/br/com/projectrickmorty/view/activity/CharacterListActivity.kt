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

    private val charlist:List<CharPosts> = emptyList()
    private val viewModel = SharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)

        for(i:Int in 1..10){

            viewModel.refreshCharacter(i)
            viewModel.characterByIdLiveData.observe(this) { response ->
                if (response == null) {
                    Toast.makeText(
                        this@CharacterListActivity,
                        "Chamada de API falhou!",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@observe
                }

                charlist.plus(response)
            }
        }

        val recyclerView = findViewById<RecyclerView>(R.id.character_list_recyclerview)
        recyclerView.adapter = CharacterListAdapter(this,charlist)

//        val intent = Intent(this, CharacterInfoActivity::class.java)
//        startActivity(intent)
    }
}