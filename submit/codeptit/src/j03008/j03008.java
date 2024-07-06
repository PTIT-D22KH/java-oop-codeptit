package j03008;

import java.util.Scanner;

public class j03008 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } 
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrettyNumber(String s) {
        int n  =s.length();
        int l = 0, r = n  - 1;
        while (l <= r) {
            int x = Integer.valueOf(s.charAt(l)) - '0';
            int y = Integer.valueOf(s.charAt(r)) - '0';
            if (!isPrime(x) || !isPrime(y)) {
                return false;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
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
