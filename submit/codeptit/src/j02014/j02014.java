package j02014;

import java.util.Scanner;

public class j02014 {
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
        int []a  = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        
    }
}
