interface Destinations {
    val route: String
}

object PokemonList : Destinations {
    override val route: String = "PokemonList"
}

object PokemonInfo : Destinations {
    override val route: String = "PokemonInfo"
}