package j01018;

import java.util.Scanner;

public class j01018 {
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
        int sumDigits = Integer.valueOf(s.charAt(0)) - '0';
        for (int i = 1; i < s.length(); i++ ){
            if (Math.abs(Integer.valueOf(s.charAt(i)) - Integer.valueOf(s.charAt((i - 1)))) != 2) {
                System.out.println("NO");
                return;
            } 
            sumDigits += Integer.valueOf(s.charAt(i)) - '0';
        }
        if (sumDigits % 10 == 0) {
            System.out.println("YES"); 
        } else {
            System.out.println("NO");
        }
    }   
}
