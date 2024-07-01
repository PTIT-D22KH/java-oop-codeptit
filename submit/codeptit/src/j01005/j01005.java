package j01005;

import java.util.Scanner;

public class j01005 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t  = input.nextInt();
        while (t-- > 0) {
            testCase();
            System.out.println();
        }
    }
    public static void testCase() {
        int n = input.nextInt();
        int h = input.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.printf("%.6f ", Math.sqrt((double)i / n) * h);
        }
        
    }
}
