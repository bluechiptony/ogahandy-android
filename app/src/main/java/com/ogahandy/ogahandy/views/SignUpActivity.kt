package com.ogahandy.ogahandy.views

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.ogahandy.ogahandy.R
import java.lang.Exception

class SignUpActivity : AppCompatActivity() {


    private var emailAddress:EditText? = null
    private var phoneNumber:EditText? = null
    private var signUp:Button? = null
    private var goBack:TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        try {
            loadResources()
        }catch (e: Exception){

        }
    }


    private fun loadResources(){
        if (this.supportActionBar != null){
            this.supportActionBar!!.hide()
        }
        phoneNumber = findViewById(R.id.phoneNumber)
        emailAddress = findViewById(R.id.emailAddress)
        signUp = findViewById(R.id.signUp)

        goBack = findViewById(R.id.goBack)

        goBack!!.setOnClickListener{
            finish()
        }
    }
    private fun changeActivity(activity: Activity){
        val intent = Intent(this, activity.javaClass)
        startActivity(intent)
    }


}
