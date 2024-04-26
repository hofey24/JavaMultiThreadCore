package part6.t6_dcl_and_volatile;

import java.util.Random;

/**
 * @author hofey
 **/
public class OneInstanceService {

    public int iAmHasState = 0;

    private static OneInstanceService test;

    private OneInstanceService() {
        iAmHasState = new Random().nextInt(200) + 1;
    }

    public static OneInstanceService getTest1() {
        if (test == null) {
            synchronized (OneInstanceService.class) {
                if (test == null) {
                    test = new OneInstanceService();
                }

            }
        }
        return test;
    }

    public static void reset() {
        test = null;
    }
}
