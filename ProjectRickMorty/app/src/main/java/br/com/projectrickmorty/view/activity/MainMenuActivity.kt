package br.com.projectrickmorty.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.projectrickmorty.R

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val characterButton = findViewById<Button>(R.id.menu_botao_personagens)
        characterButton.setOnClickListener{
            val intent = Intent(this, CharacterListActivity::class.java)
            startActivity(intent)
        }
    }
}