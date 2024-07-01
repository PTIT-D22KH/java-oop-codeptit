package dsa01001;

import java.util.*;

public class Test{
    public static Scanner input = new Scanner(System.in);
    public String testCase() {
        String s = input.next();
        char []c = s.toCharArray();
        int n = s.length();
        int i = n - 1;
        while (i >= 0 && c[i] == '1') {
            c[i] = '0';
            i--;
        }
        if (i >= 0) {
            c[i] = '1';
            return new String(c);
        } else {
            StringBuilder res = new StringBuilder(n);
            for (int j = 0; j < n; j++) {
                res.append('0');
            }
            return res.toString();
        }
    }
}