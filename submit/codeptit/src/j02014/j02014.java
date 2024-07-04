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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }
        int checkSum = 0;
        for (int i = 0; i < n; i++) {
            sum -= a[i];
            
            if (i != 0) {
                if (sum == checkSum) {
                    System.out.println(i + 1);
                    return;
                }
            } 
            checkSum += a[i];
        }
        System.out.println(-1);
        
    }
}
