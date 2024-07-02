package j02006;

import java.util.*;

public class j02006 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        testCase();
    }
    public static void testCase() {
        int n = input.nextInt();
        int m = input.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        Set<Integer> se = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            se.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = input.nextInt();
            se.add(b[i]);
        }
        for (Integer x : se) {
            System.out.printf("%d ", x);
        }
    }
}
