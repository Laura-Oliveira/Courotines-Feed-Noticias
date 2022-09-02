package com.feed.noticias.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.feed.noticias.databinding.ActivityMainBinding

class ListNewsDataActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}