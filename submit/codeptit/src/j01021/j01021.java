package j01021;

import java.util.Scanner;

public class j01021 {
    public static Scanner input = new Scanner(System.in);
    public static final int MOD = (int)1e9 + 7;
    public static void main(String[] args) {
        // Write your code here
        while (true) {
            long a = input.nextLong();
            long b = input.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(pow(a, b));
        }
    }
    public static long pow(long a, long b) {
        if (b == 1) {
            return a;
        }
        if (b == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;

        }
        if (a == 1) {
            return 1;
        }
        long res = pow(a, b / 2);
        res = (res * res) % MOD;
        if (b % 2 == 1) {
            res = (res * a ) % MOD;
        }
        return res;
    }
}
