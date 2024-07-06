package j03012;
import java.math.BigInteger;

import java.util.*;
public class j03012 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase (){
        BigInteger a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());
        System.out.println(a.add(b));
    }
}
