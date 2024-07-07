package j03025;
import java.util.*;
public class j03025 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static boolean check(String s) {
        int n = s.length();
        int cnt = 0;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                cnt++;
            }

        }
        if (cnt > 2) {
            return false;
        } else if (n % 2 == 1 && cnt <= 1) {
            return true;
        } else if (n % 2 == 0 && cnt == 1) {
            return true;
        } 
        return false;
    
    }
    public static void testCase() {
        String s = input.next();
        if (check(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
