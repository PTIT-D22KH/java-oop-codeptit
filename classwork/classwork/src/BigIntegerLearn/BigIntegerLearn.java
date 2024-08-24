package BigIntegerLearn;
import java.util.*;
import java.math.*;
public class BigIntegerLearn {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            System.out.println(a.gcd(b));
        }
        input.close();
    }
}
