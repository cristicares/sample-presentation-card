package com.cristikers.samples.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.cristikers.samples.presentationcard.ui.theme.ComposePresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePresentationCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PresentationCard(
                        modifier = Modifier.padding(innerPadding),
                        name = "Batman",
                        title = "Justiciero"
                    )
                }
            }
        }
    }
}