package com.example.custombaseadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.custombaseadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val countryList = mutableListOf("Kenya", "Tanzania", "uganda", "Ethiopia", "Rwanda")
        val flags = intArrayOf(
            R.drawable.kenya,
            R.drawable.tanzania,
            R.drawable.uganda,
            R.drawable.ethiopia,
            R.drawable.rwanda
        )

        val customAdapter = CustomAdapter(applicationContext, countryList, flags)
        binding.simpleListView.adapter = customAdapter
    }
}