package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/12/17.
 */
public class ControllingExecution {
    //Scanner initScanner = new Scanner();

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        UserInput runInput = new UserInput();
        SumOfTheNumbers runSON = new SumOfTheNumbers();
       // ProductOfTheNumbers runPON = new ProductOfTheNumbers();
        runSON.initSumOfTheNumbers(scan, runInput);

/*
        SumOrProduct runSOP = new SumOrProduct();
        runSOP.initSOP(scan, runSON, runPON);
 */
    }
}
