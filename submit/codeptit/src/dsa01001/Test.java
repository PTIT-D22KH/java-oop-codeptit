package dsa01001;

import java.util.*;

public class Test{
	public static Scanner input = new Scanner(System.in);
	public static void testCase() {
        String s = input.next();
        char []c = s.toCharArray();
        int n = s.length();
        int i = n- 1;
        while (i >= 0 && c[i] == '1') {
            c[i] = '0';
            i--;
        }
        if (i >= 0) {
            c[i] = '1';
            System.out.println(c);
        } else {
            for (int j = 1; j <= n; j++) {
                System.out.printf("0");
            }
            System.out.println();
        }

    }


}