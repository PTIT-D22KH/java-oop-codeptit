package j01016;

import java.util.Scanner;

public class j01016 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        String s = input.next();
        int cnt4 = 0, cnt7 = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '4') {
                cnt4++;
            } else if (s.charAt(i) == '7') {
                cnt7++;
            }
        }
        int sum = cnt4 + cnt7;
        if (sum == 4 || sum == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
