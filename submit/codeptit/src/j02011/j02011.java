package j02011;
import java.util.*;
public class j02011 {
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
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tmp;
            }
            System.out.printf("Buoc %d: " , i + 1);
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();

        }
    }
}
