package j02020;
import java.util.*;
public class j02020 {
    public static Scanner input = new Scanner(System.in);
    public static int []a ;
    public static int res = 0, n, k;
    public static void main(String[] args) {
        // Write your code here
        testCase();
    }
    public static void testCase() {
        n = input.nextInt();
        k = input.nextInt();
        a = new int[k + 1];
        a[0] = 0;
        Try(1);
        System.out.printf("Tong cong co %d to hop", res);
    }
    public static void Try(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                result();
            } else {
                Try(i + 1);
            }
        }
    }
    public static void result() {
        for (int i = 1; i <= k ;i++){ 
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        res++;
    }
}
