package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val digestion = findViewById<Button>(R.id.btnDigestion)
        val bp = findViewById<Button>(R.id.btnBP)
        val sugar = findViewById<Button>(R.id.btnSugar)
        val cold = findViewById<Button>(R.id.btnCold)

        val etWeight = findViewById<EditText>(R.id.etWeight)
        val etHeight = findViewById<EditText>(R.id.etHeight)
        val btnBMI = findViewById<Button>(R.id.btnBMI)
        val txtBMI = findViewById<TextView>(R.id.txtBMI)

        // Digestion Button
        digestion.setOnClickListener {

            val intent = Intent(this, FoodActivity::class.java)

            intent.putExtra("problem", "Digestion")

            startActivity(intent)
        }

        // BP Button
        bp.setOnClickListener {

            val intent = Intent(this, FoodActivity::class.java)

            intent.putExtra("problem", "BP")

            startActivity(intent)
        }

        // Sugar Button
        sugar.setOnClickListener {

            val intent = Intent(this, FoodActivity::class.java)

            intent.putExtra("problem", "Sugar")

            startActivity(intent)
        }

        // Cold Button
        cold.setOnClickListener {

            val intent = Intent(this, FoodActivity::class.java)

            intent.putExtra("problem", "Cold")

            startActivity(intent)
        }

        // BMI Calculator
        btnBMI.setOnClickListener {

            val weight = etWeight.text.toString().toDouble()

            val height = etHeight.text.toString().toDouble()

            val bmi = weight / (height * height)

            txtBMI.text = "BMI = %.2f".format(bmi)
        }
    }
}