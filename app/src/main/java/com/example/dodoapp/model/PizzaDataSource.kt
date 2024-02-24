package com.example.dodoapp.model

import com.example.dodoapp.R

object PizzaDataSource {
    val pizzaList = arrayListOf<Pizza>(
        Pizza(
            imageRes = R.drawable.pepperoni,
            title = "Пепперони с грибами",
            description = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            price = 2000
        ),
        Pizza(
            imageRes = R.drawable.wowkebab,
            title = "Вау! Кебаб",
            description = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            price = 2900
        ),
        Pizza(
            imageRes = R.drawable.naruto,
            title = "Наруто Пицца",
            description = "Куриные кусочки, соус терияки, ананасы, моцарелла, фирменный соус альфредо",
            price = 3900
        ),
        Pizza(
            imageRes = R.drawable.bavarian,
            title = "Баварская",
            description = "Острые колбаски чоризо, маринованные огурчики, красный лук, томаты, горчичный соус, моцарелла, фирменный томатный соус",
            price = 2700
        ),
        Pizza(
            imageRes = R.drawable.julien,
            title = "Пицца Жюльен",
            description = "Цыпленок, шампиньоны, ароматный грибной соус, лук, сухой чеснок, моцарелла, смесь сыров чеддер и пармезан, фирменный соус альфредо",
            price = 2700
        ),


    )
}