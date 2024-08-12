package j01024;

import java.util.Scanner;

public class j01024 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            // System.out.println(s.charAt(i));
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
                return false;
            }
        }
        return true;
    }
}
