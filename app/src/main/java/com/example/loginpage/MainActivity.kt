package com.example.loginpage

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()
    }

    private fun signIn() {
        val email= findViewById<TextInputEditText>(R.id.email_text_input)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signinbutton = findViewById<MaterialButton>(R.id.next_button)
//        TODO("Not yet implemented")

        signinbutton.setOnClickListener(){
            if(email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()){
                Toast.makeText(applicationContext, "Email or Password is not provided",Toast.LENGTH_LONG).show()
//                makeText(context: this, text: "Email or Password is not provided", Toast.LENGTH_LONG).show()

            }else
                if (email.toString() == "acesslistview@gmail.com" && password.toString() == "1234") {
                val intent = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intent)
                }else{
                    Toast.makeText(applicationContext, "wrong email or password",Toast.LENGTH_LONG).show()
//                 }
            }
        }
    }
}
