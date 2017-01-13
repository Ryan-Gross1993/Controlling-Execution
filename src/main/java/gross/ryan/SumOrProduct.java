package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class SumOrProduct {

    int userInput;
    String userCommand;
    int result;

    public void displayAnswer(String userCommand, int result) {
        if (userCommand == "SUM") {
            System.out.println("The sum from 1 to " + userInput + " is " + result);
        } else {
            System.out.println("The product from 1 to " + userInput + " is " + result);
        }

    }

    public void getInput(Scanner aScanner, UserInput anInput) {
        userInput = anInput.getUserInt(aScanner);
        userCommand = anInput.getUserCommand(aScanner);

    }

    public void initialize(Scanner aScanner, UserInput anInput) {
       getInput(aScanner, anInput);
       if (userCommand == "SUM") {
           SumOfTheNumbers temporarySum = new SumOfTheNumbers();
           result = temporarySum.findUserSum(userInput);
       } else {
           ProductOfTheNumbers temporaryProduct = new ProductOfTheNumbers();
           result = temporaryProduct.findProduct(userInput);
       }
       displayAnswer(userCommand,userInput);

    }

}
