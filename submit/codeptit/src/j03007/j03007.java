package j03007;

import java.util.Scanner;

public class j03007 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static boolean isPrettyNumber(String s) {
        int n = s.length();
        if (s.charAt(0) != '8' || s.charAt(n - 1) != '8') {
            return false;
        }
        int sumDigits = 0;
        for (int i = 0; i < n; i++) {
            sumDigits += Integer.valueOf(s.charAt(i)) - '0';
        }
        // System.out.println(sumDigits);
        if (sumDigits % 10 == 0) {
            return true;
        }
        return false;
    }
    public static void testCase() {
        String s = input.next();
        if (isPrettyNumber(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
