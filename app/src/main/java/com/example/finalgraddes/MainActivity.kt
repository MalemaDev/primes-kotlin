package com.example.finalgraddes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nota1 = findViewById<EditText>(R.id.nota1)
        val nota2 = findViewById<EditText>(R.id.nota2)
        val nota3 = findViewById<EditText>(R.id.nota3)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)

        btnCalcular.setOnClickListener {

            val n1 = nota1.text.toString().toDoubleOrNull()?: 0.0
            val n2 = nota2.text.toString().toDoubleOrNull()?: 0.0
            val n3 = nota3.text.toString().toDoubleOrNull()?: 0.0

            val promedio = (n1 + n2 + n3) / 3

            val mensaje = if(promedio >= 3.0) {
                "Promedio: $promedio es 🤙 Aprobado ".format(promedio)
            } else {
                "Promedio: $promedio es 😒 Reprobado".format(promedio)
            }

            txtResultado.text=mensaje

        }

        btnBorrar.setOnClickListener {
            nota1.text.clear()
            nota2.text.clear()
            nota3.text.clear()
            txtResultado.setText("")

        }




    }
}