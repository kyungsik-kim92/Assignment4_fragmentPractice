package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setupBottomNavigationView()

        if (savedInstanceState == null) {
            binding.bottomNavigationView.selectedItemId = R.id.fragment1
        }


    }



    private fun setupBottomNavigationView() {
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.fragment1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, Fragment1())
                        .commit()
                    true
                }

                R.id.fragment2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, Fragment2())
                        .commit()
                    true
                }

                R.id.fragment3 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, Fragment3())
                        .commit()
                    true
                }
                R.id.fragment4 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, Fragment4())
                        .commit()
                    true
                }

                else -> false
            }
        }
    }

}