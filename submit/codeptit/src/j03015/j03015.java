package j03015;
import java.math.BigInteger;
import java.util.*;
public class j03015 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        BigInteger a = new BigInteger(input.next());
        BigInteger b= new BigInteger(input.next());
        System.out.println(a.subtract(b));
    }
}
