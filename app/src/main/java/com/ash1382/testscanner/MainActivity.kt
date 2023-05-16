package com.ash1382.testscanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ash1382.testscanner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.imageButton.setOnClickListener(){

        }
    }
}