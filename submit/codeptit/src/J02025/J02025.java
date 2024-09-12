package J02025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02025 {
    private static int n;
    private static ArrayList<Integer> a;
    private static int b[];
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static void result() {
        int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     System.out.printf("%d ", b[i]);
        // }
        // System.out.println();
        for (int i = 0; i < n; i++) {
            if (b[i] == 1) {
                sum += a.get(i);
                // System.out.println(sum);
            }
        }
        if (isPrime(sum)) {
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    System.out.printf("%d ", a.get(i)); 
                }
                
            }
            System.out.println();
        }
    }
    public static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n - 1) {
                result();
            } else {
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            n = input.nextInt();
            a = new ArrayList<>(n);
            b = new int[n];
            for (int i = 0; i < n; i++) {
                a.add(input.nextInt());
            }
            Collections.sort(a, Collections.reverseOrder());
            Try(0);
        }
        input.close();

    }
}
