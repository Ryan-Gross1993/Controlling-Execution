package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class SpecificGreetingMain {

    public void initializeGreeting() {
        UserInput runInput = new UserInput();
        Scanner scan = new Scanner(System.in);
        SpecificGreeting runIG = new SpecificGreeting();
        runIG.initGreeting(scan, runInput);

    }

    public static void main(String[] args) {
        SpecificGreetingMain runThis = new SpecificGreetingMain();
        runThis.initializeGreeting();
    }
}
