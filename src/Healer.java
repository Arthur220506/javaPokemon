public class Healer {
    public void curarPokemon(Pokemon pokemon) {
        System.out.println("Curando o Pokémon: " + pokemon.getName());
        if (pokemon.getHp() + 1 > 100) {
            System.out.println("O Pokémon " + pokemon.getName() + " já está com HP máximo!");
            return;
        }
        pokemon.setHp(pokemon.getHp() + 1); 
        System.out.println("HP atual do Pokémon " + pokemon.getName() + ": " + pokemon.getHp());
    }
}
