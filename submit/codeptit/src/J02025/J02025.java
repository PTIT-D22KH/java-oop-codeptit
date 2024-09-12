package J02025;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J02025 {
    private static int n;
    private static Integer[] a = new Integer[20];
    private static Integer[] b = new Integer[20];
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
        for(int i = 1; i <= n; i++){
            sum += a[i] * b[i];
        }
        if(isPrime(sum)){
            for(int i = 1; i <= n; i++){
                if(b[i] == 1)
                    System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
    }

    public static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n) {
                result();
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = input.nextInt();
            }
            Arrays.sort(a, 1, n + 1, Comparator.reverseOrder());
            Try(1);
        }
        input.close();
    }
}