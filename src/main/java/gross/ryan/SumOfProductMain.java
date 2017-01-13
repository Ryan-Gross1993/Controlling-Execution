package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/12/17.
 */
public class SumOfProductMain {

    UserInput runInput = new UserInput();

    // Standalone
    public void initializeSON() {
        Scanner scan = new Scanner(System.in);
        SumOfTheNumbers runSON = new SumOfTheNumbers();
        runSON.initSumOfTheNumbers(scan,runInput);

    }

    public void initializeSOP() {
        Scanner scan = new Scanner(System.in);
        SumOrProduct runSOP = new SumOrProduct();
        runSOP.initialize(scan, runInput);

    }

    public void initializeGreeting() {
        Scanner scan = new Scanner(System.in);
        SpecificGreeting runIG = new SpecificGreeting();
        runIG.initGreeting(scan, runInput);

    }

    public static void main(String[] args) {
        SumOfProductMain runProgram = new SumOfProductMain();
        runProgram.initializeSON();

    }
}
