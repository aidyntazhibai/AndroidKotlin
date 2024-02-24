package com.example.dodoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dodoapp.adapter.PizzaAdapter
import com.example.dodoapp.databinding.ActivityMainBinding
import com.example.dodoapp.model.Pizza
import com.example.dodoapp.model.PizzaDataSource


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PizzaAdapter(
            onPizzaClick = {
                handlePizzaClick(it)
            }
        )

        binding.recycleview.adapter = adapter

        adapter.setData(PizzaDataSource.pizzaList)


    }

    private fun handlePizzaClick(pizza: Pizza){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("pizza", pizza)
        startActivity(intent)
    }
}
