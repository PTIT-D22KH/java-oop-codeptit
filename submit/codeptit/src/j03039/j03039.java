package j03039;
import java.math.BigInteger;
import java.util.*;
public class j03039 {
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
        BigInteger m = a.mod(b);
        BigInteger n = b.mod(a);
        if (n.intValue() == 0 || m.intValue() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
