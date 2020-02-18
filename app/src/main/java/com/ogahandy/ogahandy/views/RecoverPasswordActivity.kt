package com.ogahandy.ogahandy.views

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.ogahandy.ogahandy.R
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.lang.Exception

class RecoverPasswordActivity : AppCompatActivity() {


    private var phoneNumber:EditText? = null
    private var recoverPassword:Button? = null
    private var goBack:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recover_password)
        try {
            loadResources()
        }catch (e:Exception){

        }
    }


    private  fun loadResources(){
        if (this.supportActionBar != null){
            this.supportActionBar!!.hide()
        }

        phoneNumber = findViewById(R.id.phoneNumber)
        recoverPassword = findViewById(R.id.password)

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
