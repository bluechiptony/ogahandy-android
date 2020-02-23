package com.ogahandy.ogahandy.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ogahandy.ogahandy.R

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        loadResources()
    }


    private fun loadResources(){
        if(this.supportActionBar != null){
            this.supportActionBar!!.hide()
        }
    }
}
