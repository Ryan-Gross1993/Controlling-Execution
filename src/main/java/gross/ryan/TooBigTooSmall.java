package gross.ryan;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class TooBigTooSmall {

    int userGuess;
    int actualInt = 1;
    int previousGuess;
    int numberOfGuesses;

    public void setActualInt() {
        Random pickRandomNumber = new Random();

    }

    public void setUserGuess(Scanner aScanner, UserInput anInput) {
        userGuess = anInput.getUserInt(aScanner);
    }

    public boolean isSameGuess(int userGuess, int previousGuess) {
        return (userGuess == previousGuess);
    }


    public boolean pickedLow(int actualInt, int userGuess) {
        if (actualInt > userGuess) {
            if (!isSameGuess(userGuess, previousGuess)) {
                numberOfGuesses++;
            }
            return true;
        } else {
            return false;
        }
    }

    public void setPreviousGuess() {
        previousGuess = userGuess;
    }

    public boolean pickedHigh(int actualInt, int userGuess) {
        if (actualInt < userGuess) {
                if(!isSameGuess(userGuess, previousGuess)) {
                    numberOfGuesses++;
                }
            return true;
        } else {
            return false;
        }
    }

    public void doUntilEqual(Scanner aScanner, UserInput anInput) {
        while (userGuess != actualInt) {
            if (pickedLow(actualInt, userGuess)) {
                System.out.println("Too low. Try again!");
                setUserGuess(aScanner, anInput);
                setPreviousGuess();
            } else if (pickedHigh(actualInt, userGuess)) {
                System.out.println("Too high. Try again!");
                setUserGuess(aScanner, anInput);
                setPreviousGuess();
            }
        } numberOfGuesses += 1;
    }


    public void initializeGame(Scanner aScanner, UserInput anInput) {
        setActualInt();
        setUserGuess(aScanner, anInput);
        doUntilEqual(aScanner,anInput);
        System.out.println("Hey, what do ya know, the number was " + actualInt + "\nIt only took " + numberOfGuesses + " tries!");
    }
}
