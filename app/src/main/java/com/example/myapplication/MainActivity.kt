package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        telaMedia()
    }

    fun telaMedia() {

        setContentView(R.layout.activity_main)

        val nota1 = findViewById<EditText>(R.id.nota1)
        val nota2 = findViewById<EditText>(R.id.nota2)
        val nota3 = findViewById<EditText>(R.id.nota3)
        val nota4 = findViewById<EditText>(R.id.nota4)

        val calcular = findViewById<Button>(R.id.btnCalcular)
        val resultado = findViewById<TextView>(R.id.resultado)
        val irImc = findViewById<Button>(R.id.btnImc)

        calcular.setOnClickListener {

            val n1 = nota1.text.toString().toDouble()
            val n2 = nota2.text.toString().toDouble()
            val n3 = nota3.text.toString().toDouble()
            val n4 = nota4.text.toString().toDouble()

            val media = (n1 + n2 + n3 + n4) / 4

            resultado.text = "Média: $media"
        }

        irImc.setOnClickListener {

            telaImc()
        }
    }

    fun telaImc() {

        setContentView(R.layout.activity_imc)

        val peso = findViewById<EditText>(R.id.peso)
        val altura = findViewById<EditText>(R.id.altura)

        val calcular = findViewById<Button>(R.id.btnCalcularImc)
        val resultado = findViewById<TextView>(R.id.resultadoImc)
        val voltar = findViewById<Button>(R.id.btnVoltar)

        calcular.setOnClickListener {

            val p = peso.text.toString().toDouble()
            val a = altura.text.toString().toDouble()

            val imc = p / (a * a)

            resultado.text = "IMC: %.2f".format(imc)
        }

        voltar.setOnClickListener {

            telaMedia()
        }
    }
}