package gross.ryan;

import java.util.Random;

/**
 * Created by ryangross on 1/12/17.
 */
public class RandomNumber {

    int randomNumber;
    //Random aRandom;

    public void setRandomNumber(Random random) {
        randomNumber = random.nextInt(100);

    }

    /*
    public boolean isSecretNumber(int guess) {
        return (randomNumber == guess);

    }
    */

    public void  initRandomNumber() {
        RandomNumber aRandomNumber = new RandomNumber();
        Random aRandom = new Random();
        aRandomNumber.setRandomNumber(aRandom);
    }
}
