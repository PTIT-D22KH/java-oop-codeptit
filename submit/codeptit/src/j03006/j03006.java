package j03006;
import java.util.*;
public class j03006 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static boolean isPrettyNumber(String s) {
        int n = s.length();
        int l = 0, r = n - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            int a = Integer.valueOf(s.charAt(l)) - '0';
            int b = Integer.valueOf(s.charAt(r)) - '0';
            if (a % 2 == 1 || b % 2 == 1) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void testCase() {
        String s = input.next();
        if (isPrettyNumber(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
