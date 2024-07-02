package j02010;

import java.util.Scanner;

public class j02010 {
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
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++ ){
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                
            }
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }
}
