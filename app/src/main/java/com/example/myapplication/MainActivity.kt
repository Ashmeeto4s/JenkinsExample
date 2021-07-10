package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.type).setText(BuildConfig.BUILD_TYPE)
        Toast.makeText(this,BuildConfig.SERVER_URL,Toast.LENGTH_LONG).show()

    }
}
