package com.johncastle.composeexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Kotlin")
        }
    }
    @Composable
    fun Greeting(message: String) {
        Text(text = "I love the smell of $message in the morning...")
    }
}