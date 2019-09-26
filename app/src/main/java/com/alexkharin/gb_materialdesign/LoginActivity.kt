package com.alexkharin.gb_materialdesign

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import android.support.design.widget.Snackbar
import android.util.Log


class LoginActivity : AppCompatActivity() {
    companion object {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun login(view: View){
        val intentToInActivity = Intent(this,InActivity::class.java)
        if(editText.length()>0) {
            startActivity(intentToInActivity)
        } else {
            val snackbar = Snackbar.make(view, "Введите имя", Snackbar.LENGTH_INDEFINITE)
           snackbar.setAction("Ok"){}
            snackbar.show()
        }
    }

    fun close_all(view: View){
        finishAffinity()
    }
}

