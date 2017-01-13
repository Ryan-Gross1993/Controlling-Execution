package gross.ryan;

/**
 * Created by ryangross on 1/13/17.
 */
public class ProductOfTheNumbers {
    int userProduct = 1;


    public int getPositiveProduct(int userInput) {
        for (int i = 1; userInput >= i ; i++) {
            userProduct *= i;
        }
        return userProduct;

    }

    public int getNegativeProduct(int userInput) {
        for (int i = 1; i != userInput ; i--) {
            userProduct *= i;
        }
        return userProduct;

    }

    public int findProduct(int userInput) {
        if (userProduct >= 1) {
            userProduct = getPositiveProduct(userInput);
        } else {
            userProduct = 0;
        }
        return userProduct;
    }

}
