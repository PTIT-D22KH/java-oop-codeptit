package j01014;

import java.util.Scanner;

public class j01014 {
    public static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        long n  = input.nextLong();
        int res = 0;
        for (int i = 2; i * i <= n; i++ ){
            if (n % i == 0) {
                res = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) {
            res = (int)n;
        }
        System.out.println(res);
    }
}
