import java.util.ArrayList;
public class Pokedex {

    private ArrayList<Pokemon> pokemons;

    public Pokedex() {
        pokemons = new ArrayList<>();
    }
    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }
    public void mediaDano(){
        int totalDano = 0;
        for (Pokemon pokemon : pokemons) {
            totalDano += pokemon.getDamage();
        }
        double media = (double) totalDano / pokemons.size();
        System.out.println("A média de dano dos pokémons é: " + media);
    }
    public void maiorDano(){
        int maiorDano = 0;
        String nomeMaiorDano = "";
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getDamage() > maiorDano) {
                maiorDano = pokemon.getDamage();
                nomeMaiorDano = pokemon.getName();
            }
        }
        System.out.println("O pokémon com o maior dano é: " + nomeMaiorDano + " com " + maiorDano + " de dano.");
    }
    public void mediaVida(){
        int totalVida = 0;
        for (Pokemon pokemon : pokemons) {
            totalVida += pokemon.getHp();
        }
        double media = (double) totalVida / pokemons.size();
        System.out.println("A média de vida dos pokémons é: " + media);
    }

    public void mostrarPokemon(){
        for (Pokemon pokemon : pokemons) {
            System.out.println("Nome: " + pokemon.getName());
            System.out.println("Tipo: " + pokemon.getType());
            System.out.println("HP: " + pokemon.getHp());
            System.out.println("Dano: " + pokemon.getDamage());
            System.out.println("-------------------------");
        }
    }
    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
