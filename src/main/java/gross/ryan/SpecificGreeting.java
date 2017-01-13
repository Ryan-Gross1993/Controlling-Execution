package gross.ryan;
import java.util.Scanner;

/**
 * Created by ryangross on 1/12/17.
 */
public class SpecificGreeting {
    String name;
    boolean validName;

    public boolean isBob(String aString) {
        return (aString == "Bob");
    }

    public boolean isAlice(String aString) {
        return (aString == "Alice");
    }

    public boolean isValidName(String aString) {
        return (isAlice(name) && isBob(name));
    }

    public void displayName(String aString) {
        if (isValidName(aString)) {
            System.out.println("Hey, " + aString + "!" + " How's it going?");
        }
    }

    public void userName() {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.next();
    }

    public void initGreeting() {
        userName();
        displayName(name);
    }

}
