package j01013;

import java.util.Scanner;

public class j01013 {
    public static Scanner input = new Scanner(System.in);
    public static long res = 0;
    public static void main(String[] args) {
        // Write your code here
        int t= input.nextInt();
        while (t-- > 0) {
            testCase();
        }
        System.out.println(res);
        
    }
    public static void testCase() {
        int n = input.nextInt();
        while (n % 2 == 0) {
            res += 2;
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                n /= i;
                res += i;
            }
        }
        if (n > 2) {
            res += n;
        }
        
    }
}
