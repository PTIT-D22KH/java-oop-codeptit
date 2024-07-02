package j01015;

import java.util.Scanner;

public class j01015 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        String s = input.next();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
