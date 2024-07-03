package j02012;
import java.util.*;
public class j02012 {
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

        System.out.printf("Buoc 0: %d\n", a[0]);
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i;
            for (; j > 0 && a[j - 1] > key; j--) {
                a[j] = a[j - 1];
            }
            a[j] = key;
            System.out.printf("Buoc %d: ", i);
            for (int k = 0; k <= i; k++) {
                System.out.printf("%d ", a[k]);
            }
            System.out.println();
        }
    }
}
