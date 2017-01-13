package gross.ryan;
import java.util.Scanner;

/**
 * Created by ryangross on 1/12/17.
 */
public class SumOfTheNumbers {

    int userNumber;
    int sum = 0;

    public int getUserInput(Scanner aScanner) {
        System.out.println("What's your favorite number?\nEnter here: ");
        return userNumber = aScanner.nextInt();
    }

    public int findPositiveSum(int aNumber) {
        for(int i = 1; i <= aNumber; i++) {
            sum += i;
        }
        return sum;

    }

    public int findNegativeSum(int aNumber) {
        for(int i = 1; 1 != aNumber; i--) {
            sum -= 1;
        }
        return sum;
    }

    public int findUserSum(int aNumber) {
        if (aNumber >= 0) {
            sum = findPositiveSum(userNumber);
        } else {
            sum = findNegativeSum(userNumber);
        }
        return sum;
    }

    public void displayAnswer() {

        System.out.println("Sum from 1 to " + userNumber + " is " + sum);
    }

    // Standalone
    public void initSumOfTheNumbers(Scanner aScanner) {
        getUserInput(aScanner);
        //convertString(userString);
        findUserSum(userNumber);
        displayAnswer();
    }

    // Used w/ product
    public void initSum() {
      //  getUserInput(aScanner);
        findUserSum(userNumber);
        displayAnswer();
    }
}
