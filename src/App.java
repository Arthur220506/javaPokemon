public class App {
    public static void main(String[] args) throws Exception {
        Pokemon pokemon1 = new Pokemon( "Bulbasaur", "Grass/Poison", 45, 49);
        Pokemon pokemon2 = new Pokemon( "Charmander", "Fire", 39, 52);
        Pokemon pokemon3 = new Pokemon( "Squirtle", "Water", 99, 48);
        Pokemon pokemon4 = new Pokemon( "mewtwo", "Psychic", 100, 110);
        Pokemon pokemon5 = new Pokemon("charsard", "Fire/Flying", 78, 84);
        Pokedex pokedex = new Pokedex();
        Healer healer = new Healer();
        
        pokedex.addPokemon(pokemon1);
        pokedex.addPokemon(pokemon2);
        pokedex.addPokemon(pokemon3);
        pokedex.addPokemon(pokemon4);
        pokedex.addPokemon(pokemon5);


        pokedex.mostrarPokemon();
        pokedex.mediaDano();
        pokedex.maiorDano();
        pokedex.mediaVida();
        healer.curarPokemon(pokemon3);


    }
}
