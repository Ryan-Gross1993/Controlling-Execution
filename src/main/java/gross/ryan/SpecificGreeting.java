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
        return (isAlice(aString) && isBob(aString));
    }

    public void displayName(String aString) {
        if (isValidName(aString)) {
            System.out.println("Hey, " + aString + "!" + " How's it going?");
        } else {
            System.out.println("Who are you? Do you even code here?");
        }
    }

    public void initGreeting(Scanner aScanner, UserInput anInput) {
       name = anInput.getName(aScanner);
       displayName(name);
    }

}
