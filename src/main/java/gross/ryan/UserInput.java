package gross.ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class UserInput {
    String userCMD;

    public String getUserCMD(Scanner aScan) {
        return aScan.next();
    }

    public int getUserInt(Scanner aScan) {
        return aScan.nextInt();
    }



}
