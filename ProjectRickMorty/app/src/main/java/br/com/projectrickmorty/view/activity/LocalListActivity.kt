package br.com.projectrickmorty.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.view.recycler.adapter.LocalListAdapter

class LocalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_list)

        val recyclerView = findViewById<RecyclerView>(R.id.local_list_recyclerview)
        recyclerView.adapter = LocalListAdapter()
    }
}