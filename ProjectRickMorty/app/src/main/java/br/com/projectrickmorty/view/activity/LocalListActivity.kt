package br.com.projectrickmorty.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.model.testemodel.Locals
import br.com.projectrickmorty.view.recycler.adapter.LocalListAdapter

class LocalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_list)

        val recyclerView = findViewById<RecyclerView>(R.id.local_list_recyclerview)
        recyclerView.adapter = LocalListAdapter(this, listOf(
            Locals("Earth"),
            Locals("Mart"),
            Locals("Jupyter"),
            Locals("Gazorpazorp"),
            Locals("FlipFop"),
            Locals("Squanchy"),
            Locals("Uranus"),
            Locals("Moon"),
            Locals("XC-1234"),
            Locals("BlopBlip"),
        ))

        val intent = Intent(this, LocalInfoActivity::class.java)
        startActivity(intent)

    }
}