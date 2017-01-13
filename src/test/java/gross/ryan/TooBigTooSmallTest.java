package gross.ryan;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ryangross on 1/13/17.
 */
public class TooBigTooSmallTest {

    TooBigTooSmall test = new TooBigTooSmall();

    @Test
    public void isSameGuessTest() {
        Assert.assertTrue(test.isSameGuess(5,5));
        Assert.assertFalse(test.isSameGuess(5,6));

    }

    @Test
    public void isHighTest() {
        Assert.assertTrue(test.pickedHigh(10,100));
        Assert.assertFalse(test.pickedHigh(5,1));

    }

    @Test
    public void isLowTest() {
        Assert.assertTrue(test.pickedLow(10,5));
        Assert.assertFalse(test.pickedLow(2,5));

    }

}
