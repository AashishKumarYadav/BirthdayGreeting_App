package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(@Suppress("UNUSED_PARAMETER")view: View) {

        val name =nameInput.editableText.toString()

        val intent = Intent(this,BirthdayGreeting::class.java)
        intent.putExtra(BirthdayGreeting.NAME_EXTRA,name)
        startActivity(intent)
    }

}
