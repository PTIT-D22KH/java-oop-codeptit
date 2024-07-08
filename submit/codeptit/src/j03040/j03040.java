package j03040;
import java.util.*;
public class j03040 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = Integer.parseInt(input.nextLine());
        while (t--  > 0) {
            testCase();
        }
    }
    public static void testCase() {
        String s = input.nextLine().trim().substring(5);
        StringBuilder a = new StringBuilder(s);
        a.deleteCharAt(3);
        s = a.toString();
        if (check(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    public static boolean all6or8(String s) {
        char []a = s.toCharArray();
        for (char c : a) {
            if (c != '6' && c != '8') {
                return false;
            }
        }
        return true;
    }

    public static boolean allSame(String s) {
        char []a = s.toCharArray();
        char check = a[0];
        for (char c : a) {
            if (c != check) {
                return false;
            }
        }
        return true;
    }
    public static boolean firstThreeAndTwoLast(String s) {
        char a = s.charAt(0);
        char b = s.charAt(4);
        for (int i = 1; i <= 2; i++) {
            if (s.charAt(i) != a) {
                return false;
            }
        }
        if (s.charAt(3) != b) {
            return false;
        }
        return true;
    }
    public static boolean isIncreasing(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (Character.valueOf(s.charAt(i)) <= Character.valueOf(s.charAt(i - 1))) {
                return false;
            }
        }
        return true;
    }
    public static boolean check(String s) {
        if (all6or8(s) || allSame(s) || firstThreeAndTwoLast(s) || isIncreasing(s)) {
            return true;
        }
        return false;
    }
}
