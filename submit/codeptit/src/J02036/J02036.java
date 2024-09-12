package J02036;
import java.util.*;
public class J02036 {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    private static int lcm(int a, int b) {
        return a * b  / gcd(a, b);
    }
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            int b[] = new int[n + 1];
            b[0] = a[0];
            b[n] = a[n - 1];
            for (int i = 1; i < n; i++ ){
                b[i] = lcm(a[i - 1], a[i]);
            }
            for (int i = 0; i <= n; i++) {
                System.out.printf("%d ", b[i]);
            }
            System.out.println();
        }
        input.close();
    }
}
