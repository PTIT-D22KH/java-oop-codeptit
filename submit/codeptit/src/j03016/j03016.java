package j03016;
import java.math.BigInteger;
import java.util.*;
public class j03016 {
    public static Scanner input=  new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        BigInteger b = new BigInteger("11");
        while (t-- > 0) {
            BigInteger a = new BigInteger(input.next());
            if (a.mod(b) == BigInteger.valueOf(0)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}
