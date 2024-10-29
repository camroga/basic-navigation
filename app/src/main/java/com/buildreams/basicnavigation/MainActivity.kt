package com.buildreams.basicnavigation

import PokemonList
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

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
        composable(
            PokemonInfo.route + "/{${PokemonInfo.argPokemonNo}}",
            arguments = listOf(
                navArgument(PokemonInfo.argPokemonNo) { type = NavType.IntType })
        ) {
            PokemonInfo(it.arguments?.getInt(PokemonInfo.argPokemonNo))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyNavigation()
}