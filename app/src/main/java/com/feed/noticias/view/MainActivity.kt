package com.feed.noticias.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.feed.noticias.data.HttpHelper
import com.feed.noticias.viewModel.ViewModel
import com.feed.noticias.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    private val viewModel: ViewModel = ViewModel()
    private val httpHelper:HttpHelper = HttpHelper()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //acessa todos os elementos da arvore dom do xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.toast.observe(this, Observer {
            //it e o elemento (instancia do Boolean) do evento que vai ser emitido no canal
            if (it == true) {
                Toast.makeText(this, "Abriu lista de noticias", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ListNewsDataActivity::class.java)
                startActivity(intent)
            }
        })

        //binding.recyclerView.setOnClickListener{ viewModel.openDescriptionNews() }

        binding.btnRequestGet.setOnClickListener{ viewModel.retrieveDataGET() }
    }
}