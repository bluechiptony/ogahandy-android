package com.ogahandy.ogahandy.views

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.ogahandy.ogahandy.R
import org.w3c.dom.Text
import java.lang.Exception

class LoginActivity : AppCompatActivity() {

    private var loginButton:Button? = null
    private var emailAddress:EditText? = null
    private var password:EditText? = null
    private var forgotPassword:TextView? = null
    private var signUp:TextView? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            loadResources()
        }catch (e:Exception){

        }

    }


    private  fun loadResources(){
        if (this.supportActionBar != null){
            this.supportActionBar!!.hide()
        }

        loginButton = findViewById(R.id.login)
        emailAddress = findViewById(R.id.emailAddress)
        password = findViewById(R.id.password)
        forgotPassword = findViewById(R.id.forgotPassword)
        signUp = findViewById(R.id.signUp)

        forgotPassword!!.setOnClickListener{
            changeActivity(RecoverPasswordActivity())
        }
        signUp!!.setOnClickListener { changeActivity(SignUpActivity()) }


    }



    private fun changeActivity(activity: Activity){
        val intent = Intent(this, activity.javaClass)
        startActivity(intent)
    }

}
