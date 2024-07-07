package j03024;
import java.util.*;
public class j03024 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static boolean isValid(String s) {
        if (Character.valueOf(s.charAt(0)) == '0') {
            return false;
        }
        return true;
    }
    public static int check(String s) {
        if (!isValid(s)) {
            return -1;
        }
        int numEven = 0;
        int numOdd = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (Character.isDigit(s.charAt(i)) == false) {
                return -1;
            }
            int tmp = Character.valueOf(s.charAt(i)) - '0';
            if (tmp % 2 == 0) {
                numEven ++;
            } else {
                numOdd++;
            }
        }
        if (numEven > numOdd) {
            if (size % 2 == 0) {
                return 1;
            }
            return 0;
        } else if (numEven < numOdd){
            if (size % 2 == 1) {
                return 1;
            }
            return 0;
        }
        return 0;
    }
    public static void testCase() {
        String s= input.next();
        if (check(s) == 1) {
            System.out.println("YES");
        } else if (check(s) == 0) {
            System.out.println("NO");
        } else {
            System.out.println("INVALID");
        }
    }
}
