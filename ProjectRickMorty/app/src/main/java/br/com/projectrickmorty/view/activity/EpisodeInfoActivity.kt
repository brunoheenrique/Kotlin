package br.com.projectrickmorty.view.activity

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.SharedViewModel

class EpisodeInfoActivity : AppCompatActivity() {

    private val viewModel = SharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_episode_info)

        val id = intent.getIntExtra("id",1)

        val nomeTexto = findViewById<TextView>(R.id.episode_info_nome)
        val codigoTexto = findViewById<TextView>(R.id.episode_info_code_ep)
        val airDateTexto = findViewById<TextView>(R.id.episode_info_air_data)

        viewModel.refreshEpisode(id)
        viewModel.episodeByIdLiveData.observe(this){response ->
            if (response == null) {
                Toast.makeText(
                    this@EpisodeInfoActivity,
                    "Chamada de API falhou!",
                    Toast.LENGTH_SHORT
                ).show()
                return@observe
            }

            nomeTexto.text = response.name
            codigoTexto.text = response.episode
            airDateTexto.text = response.air_date

        }
    }
}