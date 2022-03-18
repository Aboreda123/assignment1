package com.splineguy.junit.quotient;
import java.util.*;

public class myclass {
    public static Boolean myclass() {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        if (x >= 3 && x<=100 && x % 2 == 0) {
            System.out.println("YES");
            return true;
        } else
            System.out.println("NO");
        return false;
    }
}
