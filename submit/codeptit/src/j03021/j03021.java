package j03021;
import java.util.*;
public class j03021 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static String valueNokia(char c) {
        if (c <= 'c') {
            return "2";
        } else if (c <= 'f') {
            return "3";
        } else if (c <= 'i') {
            return "4";
        } else if (c <= 'l') {
            return "5";
        } else if (c <= 'o') {
            return "6";
        } else if (c <= 's') {
            return "7";
        } else if (c <= 'v') {
            return "8";
        } else {
            return "9";
        }
    }
    public static boolean check(String res) {
        int n = res.length();
        int l = 0, r = n - 1;
        while (l <= r) {
            if (res.charAt(l) != res.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void testCase() {
        String s = input.next();
        s = s.toLowerCase();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res += valueNokia(s.charAt(i));
        }
        if (check(res)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
