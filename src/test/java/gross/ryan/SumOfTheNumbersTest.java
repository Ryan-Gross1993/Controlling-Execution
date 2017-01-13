package gross.ryan;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ryangross on 1/12/17.
 */
public class SumOfTheNumbersTest {

    SumOfTheNumbers sumOfTheNumbers = new SumOfTheNumbers();
/*
    @Test
    public void convertStringTest() {
        Assert.assertEquals(1,
                sumOfTheNumbers.convertString("1"));
    }
    */

    @Test
    public void findPositiveSumTest() {
        int expected = 3;
        int actual = sumOfTheNumbers.findPositiveSum(2);
        Assert.assertEquals(expected, actual);
    }

    public void findNegativeSumTest() {
        int expected = 0;
        int actual = sumOfTheNumbers.findNegativeSum(1);
    }

    }



