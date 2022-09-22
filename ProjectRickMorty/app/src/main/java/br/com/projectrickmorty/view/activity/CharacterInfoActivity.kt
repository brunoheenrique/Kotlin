package br.com.projectrickmorty.view.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.com.projectrickmorty.R
import br.com.projectrickmorty.view.SharedViewModel
import br.com.projectrickmorty.model.CharPosts
import com.squareup.picasso.Picasso

class CharacterInfoActivity : AppCompatActivity() {

    private val viewModel = SharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_info)

        title = ""

        val toolbar = supportActionBar
        toolbar?.setDisplayHomeAsUpEnabled(true)
        toolbar?.setDisplayHomeAsUpEnabled(true)

        var id = intent.getIntExtra("id", 1)

        val nomeTexto = findViewById<TextView>(R.id.character_info_name)
        val statusTexto = findViewById<TextView>(R.id.character_info_status)
        val specieTexto = findViewById<TextView>(R.id.character_info_specie)
        val generoTexto = findViewById<TextView>(R.id.character_info_genero)
        val imagemChar = findViewById<ImageView>(R.id.character_info_imageview)
        val origemTexto = findViewById<TextView>(R.id.character_info_origem)
        val bolinhaStatus = findViewById<ImageView>(R.id.bolinha_status_info)
        val botaoProxChar = findViewById<ImageButton>(R.id.botao_proximo_local)
        val botaoCharAnterior= findViewById<ImageButton>(R.id.botao_local_anterior)

        botaoProxChar.setOnClickListener {
            if(id<826){
                id += 1
                viewModel.refreshCharacter(id)
            }
        }
        botaoCharAnterior.setOnClickListener {
            if(id>1){
                id -=1
                viewModel.refreshCharacter(id)
            }
        }

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

            configuraListenerDeOrigemTexto(origemTexto, response)

            defineGenero(response, generoTexto)

            defineStatus(response, statusTexto, bolinhaStatus)

            nomeTexto.text = response.name
            statusTexto.text = response.status
            specieTexto.text = response.species
            origemTexto.text = response.origin.name
            Picasso.get().load(response.image).into(imagemChar)

        }
    }

    private fun configuraListenerDeOrigemTexto(
        origemTexto: TextView,
        response: CharPosts
    ) {
        origemTexto.setOnClickListener {
            val pagina = response.origin.url
            defineIdPaginaNoClick(pagina)
        }
    }

    private fun defineGenero(
        response: CharPosts,
        generoTexto: TextView
    ) {
        if (response.gender.equals(other = "Male", true)) {
            generoTexto.setBackgroundResource(R.drawable.ic_male)
        } else if (response.gender.equals(other = "Female", true)) {
            generoTexto.setBackgroundResource(R.drawable.ic_female)
        } else {
            generoTexto.setBackgroundResource(R.drawable.ic_question)
        }
    }

    private fun defineStatus(
        response: CharPosts,
        statusTexto: TextView,
        bolinhaStatus: ImageView
    ) {
        if (response.status.equals("Alive", true)) {
            statusTexto.setTextColor(Color.parseColor("#32CD32"))
            bolinhaStatus.setColorFilter(
                ContextCompat.getColor(
                    baseContext,
                    R.color.verde_limao
                )
            )
        } else if (response.status.equals("Dead", true)) {
            statusTexto.setTextColor(Color.parseColor("#FFEC0000"))
            bolinhaStatus.setColorFilter(
                ContextCompat.getColor(
                    baseContext,
                    R.color.vermelho_mais_claro
                )
            )
        } else {
            statusTexto.setTextColor(Color.parseColor("#808080"))
            bolinhaStatus.setColorFilter(ContextCompat.getColor(baseContext, R.color.cinza))
        }
    }

    private fun defineIdPaginaNoClick(pagina: String) {
        when (pagina.length) {
            43 -> {
                val paginaString = pagina.subSequence(41, 43) as String
                val idPagina: Int = paginaString.toInt()
                val intent = Intent(this, LocalInfoActivity::class.java)
                intent.putExtra("id", idPagina)
                startActivity(intent)
            }
            42 -> {
                val paginaString = pagina.subSequence(41, 42) as String
                val idPagina: Int = paginaString.toInt()
                val intent = Intent(this, LocalInfoActivity::class.java)
                intent.putExtra("id", idPagina)
                startActivity(intent)
            }
            44 -> {
                val paginaString = pagina.subSequence(41, 44) as String
                val idPagina: Int = paginaString.toInt()
                val intent = Intent(this, LocalInfoActivity::class.java)
                intent.putExtra("id", idPagina)
                startActivity(intent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}