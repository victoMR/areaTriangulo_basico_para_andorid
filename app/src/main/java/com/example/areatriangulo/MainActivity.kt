package com.example.areatriangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Atributos de clase
    private lateinit var etNum1 : EditText //variables de inicio tardio
    private lateinit var etNum2 : EditText
    private lateinit var btnResultado : Button
    private lateinit var tvResultado :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicializamos los atributos y los relacionamos con su elemento de la interfaz de usuario
        etNum1 = findViewById(R.id.etNum1) //para que encuentre el id
        etNum2 = findViewById(R.id.etNum2) //R: carpeta de r4ecursos (Resouses)
        btnResultado = findViewById(R.id.btnResultado)
        tvResultado = findViewById(R.id.tvRes)

        //agregamos un Listener al boton en el evento onClick
        btnResultado.setOnClickListener {
            //validar que las cajas de texto no esten vacias
            if(etNum1.text.isEmpty() || etNum2.text.isEmpty()){
                tvResultado.text = "Debes de escribir un numero entero"
            }else{
                //declaramos varuiabvles locales para obtener losvalores de las cajas de texto
                var num1 : Int = etNum1.text.toString().toInt()
                var num2 : Int = etNum2.text.toString().toInt()

                //hacemos operacion
                var resultado :Int = (num1 * num2)/2

                //mostramos resultado en el textView
                tvResultado.text = "EL RESULTADO ES: $resultado"
            }
        }
    }
}