package com.example.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance()
            .token
            .addOnCompleteListener {
                Log.d("Token",it.result.toString())
            }
    }
}