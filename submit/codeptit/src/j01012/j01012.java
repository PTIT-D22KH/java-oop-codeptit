package j01012;

import java.util.Scanner;

public class j01012 {
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
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    cnt++;
                }
                if (n / i != i && (n /i) % 2 == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
