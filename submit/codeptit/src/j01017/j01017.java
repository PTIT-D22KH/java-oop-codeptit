package j01017;

import java.util.Scanner;

public class j01017 {
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
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs(Integer.valueOf(s.charAt(i)) - Integer.valueOf(s.charAt(i - 1)))   != 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }
}
