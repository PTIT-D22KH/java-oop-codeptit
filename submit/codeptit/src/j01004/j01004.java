package j01004;

import java.util.Scanner;

public class j01004 {
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
    public static void testCase() {
        int n = input.nextInt();
        if (isPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
