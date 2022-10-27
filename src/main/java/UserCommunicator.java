import java.util.Scanner;

/**
 * Class that handles the communication with the user
 */
public class UserCommunicator {

    private Scanner scanner;

    public UserCommunicator() {
        scanner = new Scanner(System.in);
    }

    public String getUserInput() {
        System.out.println("Please enter the inputs for the game");
        while(!checkPattern()){
            System.out.println("Only inputs with 'N', 'S', 'O' or 'E'");
            scanner.next();
        }
        return scanner.next();
    }

    //method created to better use of tests
    public boolean checkPattern() {
        return scanner.hasNext("[NOESnoes]+");
    }
}
