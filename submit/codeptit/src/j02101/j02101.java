package j02101;
import java.util.*;
public class j02101 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
            System.out.println();
        }
    }
    public static void testCase() {
        int n = input.nextInt();
        int [][]a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++ ) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d ", a[i][j]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.printf("%d ", a[i][j]);
                }
            }
            // System.out.println();
        }
    }
}
