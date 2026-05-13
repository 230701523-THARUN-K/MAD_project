package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FoodActivity : AppCompatActivity() {
    //gg

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val txtFood = findViewById<TextView>(R.id.txtFood)

        val problem = intent.getStringExtra("problem")

        if (problem == "Digestion") {

            txtFood.text =
                "Breakfast : Oats\n\n" +
                        "Lunch : Rice and Dal\n\n" +
                        "Dinner : Soup\n\n" +
                        "Avoid : Oily Foods"
        }

        else if (problem == "BP") {

            txtFood.text =
                "Breakfast : Fruits\n\n" +
                        "Lunch : Brown Rice\n\n" +
                        "Dinner : Salad\n\n" +
                        "Avoid : Salt"
        }

        else if (problem == "Sugar") {

            txtFood.text =
                "Breakfast : Wheat Bread\n\n" +
                        "Lunch : Vegetables\n\n" +
                        "Dinner : Soup\n\n" +
                        "Avoid : Sweets"
        }

        else if (problem == "Cold") {

            txtFood.text =
                "Breakfast : Ginger Tea\n\n" +
                        "Lunch : Hot Soup\n\n" +
                        "Dinner : Warm Milk\n\n" +
                        "Avoid : Ice Cream"
        }
    }
}