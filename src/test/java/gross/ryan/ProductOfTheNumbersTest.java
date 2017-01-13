package gross.ryan;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ryangross on 1/13/17.
 */
public class ProductOfTheNumbersTest {

    ProductOfTheNumbers pomTest = new ProductOfTheNumbers();

    @Test
    public void testingProductOfPositiveNumber() {
        Assert.assertEquals(120, pomTest.getPositiveProduct(5));
    }

   @Test
    public void testingProductOfNegativeNumber() {
        Assert.assertEquals(0, pomTest.getNegativeProduct(-5));
   }

    /*
    @Test
    public void test
*/
}
