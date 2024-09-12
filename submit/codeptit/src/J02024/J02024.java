package J02024;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J02024 {
    private static int n;
    private static Integer[] a = new Integer[20];
    private static Integer[] b = new Integer[20];

    private static void result() {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += a[i] * b[i];
        }
        if(sum % 2 != 0){
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