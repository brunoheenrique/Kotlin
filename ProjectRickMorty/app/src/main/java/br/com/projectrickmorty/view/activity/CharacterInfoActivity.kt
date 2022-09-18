package br.com.projectrickmorty.view.activity

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel
import com.squareup.picasso.Picasso

class CharacterInfoActivity : AppCompatActivity() {

    private val viewModel = SharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_info)

        val id = intent.getIntExtra("id",1)

        val nomeTexto = findViewById<TextView>(R.id.character_info_name)
        val statusTexto = findViewById<TextView>(R.id.character_info_status)
        val specieTexto = findViewById<TextView>(R.id.character_info_specie)
        val generoTexto = findViewById<TextView>(R.id.character_info_genero)
        val imagemChar = findViewById<ImageView>(R.id.character_info_imageview)
        val origemTexto = findViewById<TextView>(R.id.character_info_origem)
        val bolinhaStatus = findViewById<ImageView>(R.id.bolinha_status_info)

        viewModel.refreshCharacter(id)
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
                generoTexto.setBackgroundResource(R.drawable.ic_male)
            } else if(response.gender.equals(other = "Female",  true)) {
                generoTexto.setBackgroundResource(R.drawable.ic_female)
            }else{
                generoTexto.setBackgroundResource(R.drawable.ic_question)
            }

            if(response.status.equals("Alive",  true)){
                statusTexto.setTextColor(Color.parseColor("#32CD32"))
                bolinhaStatus.setColorFilter(ContextCompat.getColor(baseContext,R.color.verde_limao))
            } else if (response.status.equals("Dead", true)) {
                statusTexto.setTextColor(Color.parseColor("#FFEC0000"))
                bolinhaStatus.setColorFilter(ContextCompat.getColor(baseContext,R.color.vermelho_mais_claro))
            }else {
                statusTexto.setTextColor(Color.parseColor("#808080"))
                bolinhaStatus.setColorFilter(ContextCompat.getColor(baseContext,R.color.cinza))
            }

            nomeTexto.text = response.name
            statusTexto.text = response.status
            specieTexto.text = response.species
            origemTexto.text = response.origin.name
            Picasso.get().load(response.image).into(imagemChar)

        }
    }
}