import java.util.ArrayList;
import java.util.Arrays;

public class World {

    //an array that stores all the cells that the user already visited
    private ArrayList<int[]> cellsVisited;
    private Ash ash;
    private int pokemonCatched;

    public World() {
        this.cellsVisited = new ArrayList<>();
        this.cellsVisited.add(new int[]{0, 0});
        ash = new Ash();
        pokemonCatched = 1;
    }

    /**
     * Moves the player in the directions received
     * and catches the pokemon in case the player
     * hasn't passed in that cell yet
     * @param directions
     */
    public void movePlayer(int[] directions) {
        ash.move(directions);
        catchPokemon();
        cellsVisited.add(ash.getPosition());
    }

    private void catchPokemon() {
        boolean contains = cellsVisited.stream().anyMatch(x -> Arrays.equals(x, ash.getPosition()));
        if(!contains) {
            pokemonCatched++;
        }
    }

    public ArrayList<int[]> getCellsVisited() {
        return cellsVisited;
    }

    public int getPokemonCatched() {
        return pokemonCatched;
    }
}
