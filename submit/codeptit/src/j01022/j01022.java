package j01022;
import java.util.*;
public class j01022 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        int n = input.nextInt();
        long k = input.nextLong();
        FiboString f = new FiboString();
        System.out.println(f.getKthString(n, k));
    }
}
