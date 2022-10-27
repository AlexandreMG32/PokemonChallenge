import static constants.ConstantsGameplay.*;

public class Gameplay {

    private World world;
    private UserCommunicator communicator;

    public Gameplay() {
        this.world = new World();
        this.communicator = new UserCommunicator();
    }

    /**
     * method that handles all the game
     * @return
     */
    public int play() {
        String userInput = communicator.getUserInput();
        doMoves(userInput);
        return world.getPokemonCatched();
    }

    /**
     * gets the userInput and for every command,
     * calls the associated function
     * @param userInput
     */
    private void doMoves(String userInput) {
        for(int i = 0; i < userInput.length(); i++) {
            switch (userInput.toUpperCase().charAt(i)) {
                case 'N': move(MOVE_NORTH);
                break;
                case 'S': move(MOVE_SOUTH);
                break;
                case 'E': move(MOVE_EAST);
                break;
                case 'O': move(MOVE_WEST);
                break;
            }
        }
    }

    /**
     * moves the player in the world of the game
     * @param direction
     */
    private void move(int[] direction) {
        world.movePlayer(direction);
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public UserCommunicator getCommunicator() {
        return communicator;
    }

    public void setCommunicator(UserCommunicator communicator) {
        this.communicator = communicator;
    }
}
