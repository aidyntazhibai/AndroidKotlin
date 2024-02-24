package com.example.dodoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dodoapp.databinding.ItemPizzaBinding
import com.example.dodoapp.model.Pizza

class PizzaAdapter (
    private val onPizzaClick: (Pizza) -> Unit
): RecyclerView.Adapter<PizzaAdapter.ViewHolder>() {



    private val pizzaList: ArrayList<Pizza> = ArrayList()

    fun setData(pizzas:ArrayList<Pizza>) {
        pizzaList.clear()
        pizzaList.addAll(pizzas)

        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPizzaBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount() = pizzaList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(pizzaList[position])
    }






    inner class ViewHolder(
        private val binding: ItemPizzaBinding
    ) : RecyclerView.ViewHolder(binding.root){

        fun bind(pizza: Pizza) {
            with(binding){
                pictures.setImageResource(pizza.imageRes)
                title.text = pizza.title
                overview.text = pizza.description
                button.text = "от ${pizza.price}T"


                root.setOnClickListener {
                    onPizzaClick(pizza)
                }
            }
        }
    }

}
