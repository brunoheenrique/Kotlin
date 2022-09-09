package br.com.projectrickmorty.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel

class CharacterInfoActivity : AppCompatActivity() {

    private val viewModel = SharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_info)

        val nomeTexto = findViewById<TextView>(R.id.character_info_name)
        val statusTexto = findViewById<TextView>(R.id.character_info_status)
        val specieTexto = findViewById<TextView>(R.id.character_info_specie)
        val generoTexto = findViewById<TextView>(R.id.character_info_genero)

        viewModel.refreshCharacter(1)
        viewModel.characterByIdLiveData.observe(this){ response ->
            if(response == null){
                Toast.makeText(
                    this@CharacterInfoActivity,
                    "Chamada de API falhou!",
                    Toast.LENGTH_SHORT
                ).show()
                return@observe
            }

            nomeTexto.text = response.name
            statusTexto.text = response.status
            specieTexto.text = response.species
            generoTexto.text = response.gender


        }

    }
}