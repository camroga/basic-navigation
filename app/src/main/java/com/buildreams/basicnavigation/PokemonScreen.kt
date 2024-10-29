package com.buildreams.basicnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.buildreams.basicnavigation.ui.theme.BasicNavigationTheme


@Composable
fun PokemonInfo(pokemonNo: Int?) {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Pikachu is the Pokemon No: $pokemonNo",
            fontSize = 32.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonInfoPreview() {
    BasicNavigationTheme {
        PokemonInfo(2)
    }
}