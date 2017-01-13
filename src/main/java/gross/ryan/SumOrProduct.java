package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class SumOrProduct {
    int userInput;
    String userCommand;
    int result;

    public int setUserInput(Scanner aScanner) {
        System.out.println("Pick a number from 1 to 100:\nEnter here: ");
        int userInput = aScanner.nextInt();
        return userInput;
    }

    public void setUserCommand(Scanner aScanner) {
        System.out.println("Sum or Product?\nEnter here:");
        userCommand = aScanner.next();
    }

    public void setInput(Scanner aScanner) {
        setUserInput(aScanner);
        setUserCommand(aScanner);
    }

    public void displayAnswer(String userCommand, int aResult) {
        if (userCommand == "SUM") {
            System.out.println("The sum from 1 to " + userInput + " is " + result);
        } else {
            System.out.println("The product from 1 to " + userInput + " is " + result);
        }
    }




    public void initSOP(Scanner aScanner, SumOfTheNumbers aSON, ProductOfTheNumbers aPOD) {
        setInput(aScanner);
        if (userCommand == "SUM") {
            aSON.initSum();
            displayAnswer(userCommand, result);
        }
     }

}
