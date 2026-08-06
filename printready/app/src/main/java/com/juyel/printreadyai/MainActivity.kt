package com.juyel.printreadyai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.juyel.printreadyai.ui.PrintReadyTheme
import com.juyel.printreadyai.ui.PrintReadyApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrintReadyTheme {
                PrintReadyApp()
            }
        }
    }
}
