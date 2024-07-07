package j03033;
import java.math.BigInteger;
import java.util.*;
public class j03033 {
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
        BigInteger mul  = a.multiply(b);
        BigInteger div = a.gcd(b);
        BigInteger res = mul.divide(div);
        System.out.println(res);
    }
}
