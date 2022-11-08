package br.com.mypokedex.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.mypokedex.R
import br.com.mypokedex.ui.fragment.PokemonListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transacao = supportFragmentManager.beginTransaction()
        val fragment = PokemonListFragment()
//        val dados = Bundle()
        transacao.add(R.id.main_activity_container,fragment)
        transacao.commit()
    }
}