package com.johncastle.composeexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Coffe")
        }
    }
    //https://www.paradigmadigital.com/dev/disenar-interfaces-jetpack-compose/
    @Preview
    @Composable
    fun Greeting(message: String) {
        Column(Modifier.background(color = Color.White)) {
            Text(text = "Nombre de la cosa")
            Text(text = "Información y tal")
        }
    }
}