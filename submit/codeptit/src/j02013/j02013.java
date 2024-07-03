package j02013;

import java.util.Scanner;

public class j02013 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        testCase();
    }
    public static void testCase() {
        int n = input.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        // System.out.println("INPUT");
        for (int i = n - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            System.out.printf("Buoc %d: ", n - i);
            for (int j =0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }
}
