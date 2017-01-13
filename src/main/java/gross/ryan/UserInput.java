package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/12/17.
 */
public class UserInput {

    int uNumber;

    public int getUserCommand(Scanner aScanner) {
        System.out.println("Pick a number between 1-100: ");
        int userGuess = aScanner.nextInt();
        return userGuess;
    }

    public void initUserInput(Scanner aScanner) {
        UserInput aUser = new UserInput();
        aUser.getUserCommand(aScanner);

    }
}
