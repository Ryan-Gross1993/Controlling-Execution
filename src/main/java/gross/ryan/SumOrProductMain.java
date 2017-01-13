package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class SumOrProductMain {

    public void initializeSOP() {
        UserInput runInput = new UserInput();
        Scanner scan = new Scanner(System.in);
        SumOrProduct runSOP = new SumOrProduct();
        runSOP.initialize(scan, runInput);

    }

    public static void main(String[] args) {
        SumOrProductMain runThis = new SumOrProductMain();
        runThis.initializeSOP();

    }

}
