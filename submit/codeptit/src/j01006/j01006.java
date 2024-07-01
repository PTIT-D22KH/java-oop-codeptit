package j01006;

import java.util.Scanner;

public class j01006 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        int n = input.nextInt();
        FibonacciNumber f = new FibonacciNumber(n);
        System.out.println(f.getNthFiboNumber(n));
    }
}
