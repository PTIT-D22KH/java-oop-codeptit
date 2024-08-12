package j01011;

import java.util.Scanner;

public class j01011 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t=  input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase (){
        int a = input.nextInt();
        int b= input.nextInt();
        System.out.printf("%d %d\n", lcm(a,b), gcd(a, b));
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static long lcm(int a, int b) {
        return (long) a * b / gcd(a, b);
    }
}