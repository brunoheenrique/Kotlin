package br.com.projectrickmorty.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.projectrickmorty.R

class CharacterListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)
    }
}