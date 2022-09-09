package br.com.projectrickmorty.view.activity

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.projectrickmorty.R
import br.com.projectrickmorty.controller.retrofit.NetworkUtils
import br.com.projectrickmorty.controller.retrofit.services.CharacterService
import br.com.projectrickmorty.model.CharPosts
import br.com.projectrickmorty.view.recycler.adapter.CharacterListAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterListActivity : AppCompatActivity() {

//    private val charlist = emptyList<CharPosts>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)

        val recyclerView = findViewById<RecyclerView>(R.id.character_list_recyclerview)
        recyclerView.adapter = CharacterListAdapter(this)

        fetchChars()


//        val intent = Intent(this, CharacterInfoActivity::class.java)
//        startActivity(intent)

    }

    private fun fetchChars() {
        val retrofitClient = NetworkUtils.getretrofit("https://rickandmortyapi.com/api/")
        val endpoint = retrofitClient.create(CharacterService::class.java)
        val callback = endpoint.getPosts()

        callback.enqueue(object : Callback<CharPosts>{
            override fun onResponse(call: Call<CharPosts>, response: Response<CharPosts>) {


            }

            override fun onFailure(call: Call<CharPosts>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
                Log.i("API", "API NAO ENTROU ENTROU - $t")
            }

        })
    }
}