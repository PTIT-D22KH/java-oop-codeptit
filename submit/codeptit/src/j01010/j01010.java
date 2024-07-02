package j01010;

import java.util.Scanner;

public class j01010 {
    public static Scanner input=  new Scanner(System.in);
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
        String res = "";
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                res += "0";
            } else if (s.charAt(i) == '1') {
                res += "1";
            } else {
                System.out.println("INVALID");
                return;
            }
        }
        StringBuilder finalRes = new StringBuilder(res);
        while (finalRes.length() >0 && finalRes.charAt(0) == '0') {
            finalRes.deleteCharAt(0);
        }
        res = String.valueOf(finalRes);
        if (res.equals("")) {
            System.out.println("INVALID");
            return;
        }
        System.out.println(res);

    }
}
