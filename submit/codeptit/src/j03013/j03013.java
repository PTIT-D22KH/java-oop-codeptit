package j03013;
import java.math.BigInteger;
import java.util.*;
public class j03013 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        BigInteger a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());
        String s = String.valueOf(a.subtract(b).abs());
        int maxLength = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
        while (s.length() < maxLength) {
            s = "0" + s;
        } 
        System.out.println(s);
    }
}
