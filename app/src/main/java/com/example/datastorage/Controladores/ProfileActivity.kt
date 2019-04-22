package com.example.datastorage.Controladores

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.datastorage.R

class ProfileActivity : AppCompatActivity() {

    companion object{
        const val USER_NAME_SHOW = "user_name_show"
        const val USER_EMAIL_SHOW = "user_email_show"
        const val USER_AGE_SHOW = "user_age_show"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val textName = findViewById<TextView>(R.id.nameProfile)
        val textAge = findViewById<TextView>(R.id.ageProfile)
        val textEmail = findViewById<TextView>(R.id.emailProfile)

        val name = intent.getStringExtra(USER_NAME_SHOW)
        val age = intent.getIntExtra(USER_AGE_SHOW, 0)
        val email = intent.getStringExtra(USER_EMAIL_SHOW)

        textName.text = name
        textAge.text = age.toString()
        textEmail.text = email
    }

    fun volverButton(view : View){
        val intent = Intent(this, UsersListActivity::class.java)
        startActivity(intent)
        finish()
    }
}
