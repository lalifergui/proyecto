package com.example.pantallalogin


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro) // Cambia por tu XML de registro

        val nombre = findViewById<EditText>(R.id.edit_text_id_email3)
        val apellidos = findViewById<EditText>(R.id.edit_text_id_email4)
        val email = findViewById<EditText>(R.id.edit_text_id_email5)
        val contraseña = findViewById<EditText>(R.id.edit_text_id_email6)

        val btnRegistrar = Button(this).apply {
            text = "Registrar"
        }

        btnRegistrar.setOnClickListener {
            val n = nombre.text.toString()
            val a = apellidos.text.toString()
            val e = email.text.toString()
            val c = contraseña.text.toString()

            if (n.isNotEmpty() && a.isNotEmpty() && e.isNotEmpty() && c.isNotEmpty()) {
                Toast.makeText(this, "Usuario $n $a registrado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        // Añadir el botón al layout (asegúrate de que tu ConstraintLayout tenga un id)
        val layout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.root_layout)
        layout.addView(btnRegistrar)
    }
}
