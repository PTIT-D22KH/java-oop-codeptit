package j03018;
import java.util.*;
public class j03018 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase () {
        String n = input.next();
        int mod = 0;
        for (int i = 0; i < n.length(); i++) {
            mod = (mod * 10 + n.charAt(i) - '0') % 4;
        }
        if (mod == 0) {
            System.out.println(4);
        } else {
            System.out.println(0);
        }
    }
}
