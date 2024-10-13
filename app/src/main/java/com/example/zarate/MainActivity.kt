package com.example.zarate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.zarate.ui.theme.ZarateTheme
import com.example.zarate.view.SeriesApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()  // Habilita diseño de borde a borde (opcional)

        // Aquí establecemos el contenido principal de la aplicación
        setContent {
            ZarateTheme {
                // Llamamos a la función principal de la aplicación, que es SeriesApp
                SeriesApp()
            }
        }
    }
}
