package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/12/17.
 */
public class PlayGame {

    public void initialize(Scanner aScanner, UserInput anInput, RandomNumber aRandomNumber, NumberComparator aNumberComparator, DisplayAnswer aDisplayAnswer) {

        anInput.initUserInput(aScanner);
        aRandomNumber.initRandomNumber();
        aNumberComparator.initNumberComparator();
        aDisplayAnswer.displayAnswer(aNumberComparator,anInput,aRandomNumber);

    }

    public void anotherTry(Scanner aScanner, UserInput anInput, RandomNumber aRandomNumber, NumberComparator aNumberComparator, DisplayAnswer aDisplayAnswer) {
        while (aNumberComparator.isEqual == false) {
            anInput.initUserInput(aScanner);
            aNumberComparator.initNumberComparator();
            aDisplayAnswer.displayAnswer(aNumberComparator,anInput,aRandomNumber);

        }
    }

    public void runGame(Scanner aScanner, UserInput anInput, RandomNumber aRandomNumber, NumberComparator aNumberComparator, DisplayAnswer aDisplayAnswer) {
        initialize(aScanner,anInput,aRandomNumber, aNumberComparator, aDisplayAnswer);
        anotherTry(aScanner,anInput,aRandomNumber,aNumberComparator, aDisplayAnswer);

    }

    public static void main(String[] args) {
        PlayGame pleaseRun = new PlayGame();
        Scanner gameScanner = new Scanner(System.in);
        UserInput gameInput = new UserInput();
        RandomNumber randomNumberForGame = new RandomNumber();
        NumberComparator gameComparatorForGame = new NumberComparator();
        DisplayAnswer gameDisplayAnswer = new DisplayAnswer();
        pleaseRun.runGame(gameScanner,gameInput,randomNumberForGame,gameComparatorForGame,gameDisplayAnswer);
    }
}
