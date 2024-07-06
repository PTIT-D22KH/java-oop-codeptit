package j03011;

import java.math.BigInteger;
import java.util.Scanner;

public class j03011 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Write your code here
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        BigInteger a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());
        System.out.println(a.gcd(b));

    }
}
