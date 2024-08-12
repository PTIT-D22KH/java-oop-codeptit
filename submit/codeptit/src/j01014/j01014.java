package j01014;

import java.util.Scanner;
import java.util.ArrayList;
public class j01014 {
    public static Scanner input= new Scanner(System.in);
    public static long MAX = 1e10 + 1;
    public static ArrayList<Long> prime = new ArrayList<>();
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void sieve() {
        for (int i = 0; i < prime.size(); i++) {
            prime.set(i, 0);
        }
        for (int i = 2; i * i < MAX; i++) {
            if (prime.get(i) == 0) {
                for (int j = i; j < MAX; j += i) {
                        prime.set(j, i);
                }
            }
        }
    }
    public static void testCase() {
        long n  = input.nextLong();
        // int res = 0;
        // for (int i = 2; i * i <= n; i++ ){
        //     if (n % i == 0) {
        //         res = i;
        //         while (n % i == 0) {
        //             n /= i;
        //         }
        //     }
        // }
        // if (n > 1) {
        //     res = (int)n;
        // }
        // System.out.println(res);
        System.out.println(prime.get(n));
    }
}
