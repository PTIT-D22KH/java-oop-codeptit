package j01021;

import java.util.Scanner;

public class j01021 {
    public static Scanner input = new Scanner(System.in);
    public static final int MOD = (int)1e9 + 7;
    public static void main(String[] args) {
        // Write your code here
        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(pow(a, b));
        }
    }
    public static long pow(int a, int b) {
        if (b == 1) {
            return a;
        }
        long res = pow(a, b / 2);
        res = (res * res) % MOD;
        if (b % 2 == 1) {
            res = (res * a ) % MOD;
        }
        return res;
    }
}
