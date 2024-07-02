package j01026;

import java.util.Scanner;

public class j01026 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            if (check(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check(long n) {
        long x = (long)Math.sqrt(n);
        if (x * x == n) {
            return true;
        }
        return false;
    }
}
