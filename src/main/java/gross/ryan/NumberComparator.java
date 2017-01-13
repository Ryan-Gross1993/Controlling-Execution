package gross.ryan;

/**
 * Created by ryangross on 1/12/17.
 */
public class NumberComparator {

    boolean isHigh;
    boolean isLow;
    boolean isEqual;
    int userNumber;
    int ranNumber;

    public boolean isHigh(RandomNumber aRandomNumber, UserInput aUserInput) {
        isHigh = (aRandomNumber.randomNumber < a);
        return isHigh;

    }

    public boolean isLow(RandomNumber aRandomNumber, UserInput aUserInput) {
        isLow = (aRandomNumber.randomNumber > aUserInput.userGuess);
        return isLow;
    }

    public boolean isEqual(RandomNumber aRandomNumber, UserInput aUserInput) {
        isEqual = (aRandomNumber.randomNumber == aUserInput.userGuess);
        return isEqual;
    }

    public boolean compareNumbers(RandomNumber aRandomNumber, UserInput aUserInput) {
        if (isHigh(aRandomNumber, aUserInput)) {
            return isHigh;
        } else if (isLow(aRandomNumber, aUserInput)) {
            return isLow;
        } else {
            return (isEqual(aRandomNumber, aUserInput));
        }
    }

    public void initNumberComparator() {
        NumberComparator aNumberComparator = new NumberComparator();
    }

}
