package com.project.demoroofimon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentToNewActivityButton = findViewById<Button>(R.id.intentToNewActivityButton)

        intentToNewActivityButton.text = "Next !!"

        intentToNewActivityButton.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
