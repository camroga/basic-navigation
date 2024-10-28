package com.buildreams.basicnavigation

import PokemonList
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNavigation()
        }
    }
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PokemonList.route) {
        composable(PokemonList.route) {
            PokemonList(navController)
        }
        composable(PokemonInfo.route) {
            PokemonInfo()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyNavigation()
}