package br.com.projectrickmorty.view.activity

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.projectrickmorty.R
import br.com.projectrickmorty.view.SharedViewModel

class LocalInfoActivity : AppCompatActivity() {

    private val viewModel = SharedViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_info)

        title = ""

        val toolbar = supportActionBar
        toolbar?.setDisplayHomeAsUpEnabled(true)
        toolbar?.setDisplayHomeAsUpEnabled(true)

        var id = intent.getIntExtra("id", 1)

        val nomeTexto = findViewById<TextView>(R.id.local_info_name)
        val tipoTexto = findViewById<TextView>(R.id.local_info_tipo)
        val dimensaoTexto = findViewById<TextView>(R.id.local_info_dimensao)
        val botaoProxLocal = findViewById<ImageButton>(R.id.botao_proximo_local)
        val botaoLocalAnterior = findViewById<ImageButton>(R.id.botao_local_anterior)

        botaoProxLocal.setOnClickListener {
            if (id < 126) {
                id += 1
                viewModel.refreshLocation(id)
            }
        }

        botaoLocalAnterior.setOnClickListener {
            if (id > 1) {
                id -= 1
                viewModel.refreshLocation(id)
            }
        }

        viewModel.refreshLocation(id)
        viewModel.localByIdLiveData.observe(this) { response ->
            if (response == null) {
                Toast.makeText(
                    this@LocalInfoActivity,
                    "Chamada de API falhou!",
                    Toast.LENGTH_SHORT
                ).show()
                return@observe
            }

            nomeTexto.text = response.name
            tipoTexto.text = response.type
            dimensaoTexto.text = response.dimension

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}