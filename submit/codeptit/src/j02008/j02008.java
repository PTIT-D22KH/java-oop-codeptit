package j02008;
import java.util.*;
public class j02008 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        long n = input.nextLong();
        long res = 1;
        for (long i = 1; i <= n; i++ ){
            res = lcm(i, res);
        }
        System.out.println(res);
    }

    public static long gcd(long  a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static long lcm(long a, long b) {
        return a * b /  gcd(a, b);
    }
}
