package com.example.dodoapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dodoapp.databinding.ActivitySecondBinding
import com.example.dodoapp.model.Pizza

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val result = intent.getSerializableExtra("pizza") as Pizza



        binding.pizzaimage.setImageResource(result.imageRes)
        binding.overview2.text = result.description
        binding.title2.text = result.title
        binding.buybutton.text = "В корзину ${result.price}₸"



    }

    fun goBack(view: View){
        finish()
    }
}