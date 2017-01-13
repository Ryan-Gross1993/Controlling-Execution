package gross.ryan;

/**
 * Created by ryangross on 1/12/17.
 */
public class DisplayAnswer {

    public void displayAnswer(NumberComparator aNumberComparator, UserInput aUserInput, RandomNumber aRandomNumber) {
        if (aNumberComparator.compareNumbers(aRandomNumber, aUserInput) == aNumberComparator.isHigh) {
            System.out.println(aRandomNumber.randomNumber + "is too high! Try again.");
        } else if (aNumberComparator.compareNumbers(aRandomNumber,aUserInput) == aNumberComparator.isLow) {
            System.out.println(aRandomNumber.randomNumber + "is too low! Try again.");
        } else {
            System.out.println(aRandomNumber.randomNumber + " is right! Congratulations, you win!");
        }
    }

    public void initDisplay() {
        DisplayAnswer aDisplayAnswer = new DisplayAnswer();
    }

}
