package j01007;

import java.util.Scanner;

public class j01007 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }

    }
    public static void testCase() {
        long n = input.nextInt();
        FibonacciNumber f = new FibonacciNumber();
        if (f.isFiboNumber(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
