package com.buildreams.basicnavigation

import PokemonInfo
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.buildreams.basicnavigation.ui.theme.BasicNavigationTheme


@Composable
fun PokemonList(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "List of Pokemons",
            fontSize = 32.sp
        )
        Button(
            onClick = {

                navController.navigate(PokemonInfo.route+ "/10")
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4CE14))
        ) {
            Text(
                text = "View Pokemon Selected",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonListPreview() {
    BasicNavigationTheme {
        val navController = rememberNavController()
        PokemonList(navController)
    }
}