package br.com.apiresttestes

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextView>(R.id.id_texto)
        val fotoImageView = findViewById<ImageView>(R.id.imageView)

        val retrofit = NetworkUtils.getRetrofitInstance("https://rickandmortyapi.com/api/")

        val characterService: CharService = retrofit.create(CharService::class.java)

        characterService.getCharById(145).enqueue(object : Callback<Modelo> {
            override fun onResponse(call: Call<Modelo>, response: Response<Modelo>) {
                Log.i("MainActivity", response.toString())
                val body = response.body()!!
                val nomeapi = body.name
                val fotoapi = body.image
                Picasso.get().load(fotoapi).into(fotoImageView)
                nome.text = nomeapi

            }

            override fun onFailure(call: Call<Modelo>, t: Throwable) {
                Log.e("MainActivity", t.message ?: "Null message")

            }
        })
    }
}
