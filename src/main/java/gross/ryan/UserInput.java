package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class UserInput {


    // Used for Sum OR Product..
    public String getUserCommand(Scanner aScan) {
        System.out.println("Add or Multiply? Enter Here: ");
        return aScan.next();

    }

    public int getUserInt(Scanner aScan) {
        System.out.print("Number between 1-100:\nEnter here: ");
        return aScan.nextInt();

    }

    public String getName(Scanner aScan) {
        System.out.println("Hey! What's your name?");
        return aScan.next();

    }

}
