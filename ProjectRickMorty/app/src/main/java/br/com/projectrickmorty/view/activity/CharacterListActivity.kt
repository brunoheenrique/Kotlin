package br.com.projectrickmorty.view.activity

import android.annotation.SuppressLint
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

    private val charlist = emptyList<CharPosts>()

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
        val retrofitClient = NetworkUtils.getretrofit("https://rickandmortyapi.com/")
        val endpoint = retrofitClient.create(CharacterService::class.java)
        val callback = endpoint.getPosts()

        callback.enqueue(object : Callback<List<CharPosts>>{
            override fun onResponse(
                call: Call<List<CharPosts>>,
                response: Response<List<CharPosts>>
            ) {
                response.body()?.forEach{
                    val charName = findViewById<TextView>(R.id.item_character_name)
                    val charSpecie = findViewById<TextView>(R.id.item_character_specie)
                    val charGender = findViewById<TextView>(R.id.item_character_gender)
                    charName.text = charName.text.toString().plus(it.name)
                    charSpecie.text = charSpecie.text.toString().plus(it.species)
                    charGender.text = charGender.text.toString().plus(it.gender)
                }

            }

            override fun onFailure(call: Call<List<CharPosts>>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
                Log.i("API", "API NAO ENTROU ENTROU - $t")
            }

        })
    }
}