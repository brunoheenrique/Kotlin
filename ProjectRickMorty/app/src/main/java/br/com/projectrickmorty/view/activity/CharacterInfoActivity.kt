package br.com.projectrickmorty.view.activity

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel
import com.squareup.picasso.Picasso

class CharacterInfoActivity : AppCompatActivity() {

    private val viewModel = SharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_info)

        val nomeTexto = findViewById<TextView>(R.id.character_info_name)
        val statusTexto = findViewById<TextView>(R.id.character_info_status)
        val specieTexto = findViewById<TextView>(R.id.character_info_specie)
        val generoTexto = findViewById<TextView>(R.id.character_info_genero)
        val imagemChar = findViewById<ImageView>(R.id.character_info_imageview)
        val origemTexto = findViewById<TextView>(R.id.character_info_origem)

        val i = 4

        viewModel.refreshCharacter(i)
        viewModel.characterByIdLiveData.observe(this) { response ->
            if (response == null) {
                Toast.makeText(
                    this@CharacterInfoActivity,
                    "Chamada de API falhou!",
                    Toast.LENGTH_SHORT
                ).show()
                return@observe
            }

            if(response.gender.equals(other = "Male",  true)){
                generoTexto.setTextColor(Color.parseColor("#FF3DA4BD"))
            } else {
                generoTexto.setTextColor(Color.parseColor("#FF1493"))
            }

            if(response.status.equals("Alive",  true)){
                statusTexto.setTextColor(Color.parseColor("#32CD32"))
            } else if (response.status.equals("Dead", true)) {
                statusTexto.setTextColor(Color.parseColor("#FFEC0000"))
            }else {
                statusTexto.setTextColor(Color.parseColor("#808080"))
            }

            nomeTexto.text = response.name
            statusTexto.text = response.status
            specieTexto.text = response.species
            generoTexto.text = response.gender
            origemTexto.text = response.origin.name
            Picasso.get().load(response.image).into(imagemChar)


        }

    }
}