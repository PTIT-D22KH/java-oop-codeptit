package j02022;
import java.util.*;
public class j02022 {
    public static Scanner input = new Scanner(System.in);
    public static int[]a ;
    public static boolean[]used;
    public static int n;
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
            // System.out.println();
        }
    }
    public static void testCase() {
        n = input.nextInt();
        a = new int[n + 1];
        used = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            used[i] = false;
        }
        Try(1);
    }
    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!used[j]) {
                a[i] = j;
                used[j] = true;
                if (i == n) {
                    result();
                } else {
                    Try(i + 1);
                }
                used[j] = false;
            }
        }
    }
    public static void result() {
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1) {
                return;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
}
