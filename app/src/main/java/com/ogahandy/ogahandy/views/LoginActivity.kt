package com.ogahandy.ogahandy.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.ogahandy.ogahandy.R

class LoginActivity : AppCompatActivity() {

    private var loginButton:Button? = null
    private var userNameText:EditText? = null
    private  var passwordText:EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private  fun loadResources(){

    }

    private  fun openSignUp (){

    }

    private fun openRecover(){}
}
