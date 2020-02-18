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

class ActivateAccountActivity : AppCompatActivity() {


    private var codeTextBox:EditText? = null
    private var activate:Button? = null
    private var resend:TextView? = null
    private var goBack:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activate_account)
        try {
            loadResources()
        }catch (e: Exception){

        }
    }


    private fun loadResources(){
        if (this.supportActionBar != null){
            this.supportActionBar!!.hide()
        }
        codeTextBox = findViewById(R.id.activationCode)

        resend = findViewById(R.id.tooLong)
        activate = findViewById(R.id.activate)

        goBack = findViewById(R.id.goBack)

        goBack!!.setOnClickListener{
            finish()
        }
    }


    private fun changeActivity(activity:Activity){
        val intent = Intent(this, activity.javaClass)
        startActivity(intent)
    }
}
