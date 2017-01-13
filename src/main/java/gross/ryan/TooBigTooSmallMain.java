package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class TooBigTooSmallMain {

    public void initTBTS() {
        Scanner runScan = new Scanner(System.in);
        UserInput runUser = new UserInput();
        TooBigTooSmall runThis = new TooBigTooSmall();
        runThis.initializeGame(runScan, runUser);
    }


    public static void main(String[] args) {
        TooBigTooSmallMain runGame = new TooBigTooSmallMain();
        runGame.initTBTS();
    }
}
