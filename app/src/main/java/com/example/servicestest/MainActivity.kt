package com.example.servicestest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicestest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var start = binding.start
        var stop = binding.stop
        start.setOnClickListener(){
            startService(Intent(this,RigntoneService::class.java))
        }
        stop.setOnClickListener(){
            stopService(Intent(this,RigntoneService::class.java))
        }
    }
}