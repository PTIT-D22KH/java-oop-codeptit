package j01013;

import java.util.Scanner;

public class j01013 {
    public static Scanner input = new Scanner(System.in);
    public static int res = 0;
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
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                    res += i;
                }
            }
        }
        if (n > 1) {
            res += n;
        }
        
    }
}
