package com.ogahandy.ogahandy.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.ogahandy.ogahandy.R

class ActivateAccountActivity : AppCompatActivity() {


    private var codeTextBox:EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activate_account)
    }
}
