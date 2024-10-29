interface Destinations {
    val route: String
}

object PokemonList : Destinations {
    override val route: String = "PokemonList"
}

object PokemonInfo : Destinations {
    const val argPokemonNo = "PokemonNo"
    override val route: String = "PokemonInfo"
}