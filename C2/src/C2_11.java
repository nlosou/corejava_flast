/*
 * Copyright (c) 2025.
 * @author 漾木茶
 *
 */

import java.util.Random;

public class C2_11 {

    private static Random generator = new Random();
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
        // Ok to access the static generator variable
    }
}
