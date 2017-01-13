package gross.ryan;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ryangross on 1/12/17.
 */
public class SpecificGreetingTest {

    SpecificGreeting specificGreetingTest = new SpecificGreeting();

    @Test
    public void isBobTest() {
        Assert.assertTrue(specificGreetingTest.isBob("Bob"));
        Assert.assertFalse(specificGreetingTest.isBob("Joe"));

    }

    public void isAliceTest() {
        Assert.assertTrue(specificGreetingTest.isAlice("Alice"));
        Assert.assertFalse(specificGreetingTest.isAlice("Beth"));

    }


}
