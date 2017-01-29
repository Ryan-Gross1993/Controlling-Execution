package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/12/17.
 */
public class SumOfProductMain {


    // Standalone
    public void initializeSOP() {
        UserInput runInput = new UserInput();
        Scanner scan = new Scanner(System.in);
      //  SumOfTheNumbers runSON = new SumOfTheNumbers();
        //runSON.initSumOfTheNumbers(scan,runInput);
        SumOrProduct initSOP = new SumOrProduct();
        initSOP.initialize(scan, runInput);

    }

    public static void main(String[] args) {
        SumOfProductMain runProgram = new SumOfProductMain();
        runProgram.initializeSOP();

    }
}
