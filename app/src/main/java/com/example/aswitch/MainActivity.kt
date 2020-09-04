package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var botao: Button
    lateinit var interruptor: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.statusSwitch)
        botao = findViewById(R.id.button)
        interruptor = findViewById(R.id.switch3)

        /*
        interruptor.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                TODO("Not yet implemented")
            }

        })
        */

        interruptor.setOnCheckedChangeListener{
            buttonView, isChecked -> isChecked
            var ligadoOuDesligado = ""
            if(isChecked) {
                ligadoOuDesligado = "Ligado"
            } else {
                ligadoOuDesligado = "Desligado"
            }

            texto.text = ligadoOuDesligado
        }

        botao.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var ligadoOuDesligado = ""
                if(interruptor.isChecked) {
                    ligadoOuDesligado = "Ligado"
                } else {
                    ligadoOuDesligado = "Desligado"
                }

                Toast.makeText(applicationContext, "Switch está: "+ligadoOuDesligado, Toast.LENGTH_LONG).show()
            }

        })

    }
}