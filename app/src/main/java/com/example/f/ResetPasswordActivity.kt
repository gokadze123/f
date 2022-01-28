package com.example.f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class ResetPasswordActivity : AppCompatActivity() {

    private lateinit var buttonLogOut : Button
    private lateinit var buttonChangePassword : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)
        init()
        logOutListeners()
    }

    private fun init(){
        buttonLogOut = findViewById(R.id.buttonLogOut)
        buttonChangePassword = findViewById(R.id.buttonChangePassword)

    }
    private fun logOutListeners(){
        buttonLogOut.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this,LoginActivity::class.java))
            finish()

        }
        buttonChangePassword.setOnClickListener {
            startActivity(Intent(this,PasswordChangeActivity::class.java))
        }


    }
}