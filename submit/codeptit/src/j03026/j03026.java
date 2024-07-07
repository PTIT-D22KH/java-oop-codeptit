package j03026;
import java.util.*;
public class j03026 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t=  input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        String a = input.next();
        String b = input.next();
        int n = a.length();
        int m = b.length();
        if (n == m) {
            System.out.println("-1");
            return;
        }
        System.out.println(Math.max(a.length(), b.length()));
    }
}
