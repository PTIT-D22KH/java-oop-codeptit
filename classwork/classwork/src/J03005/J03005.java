package J03005;

import java.util.ArrayList;
import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            String s = input.nextLine().trim();
            System.out.println(normalizeName(s));
        }
        input.close();
    }
    public static String normalizeName(String s) {
        String a[] = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            res.append(Character.toUpperCase(a[i].charAt(0)));
            for (int j = 1; j < a[i].length(); j++ ){
                res.append(Character.toLowerCase(a[i].charAt(j)));
            }
            if (i == a.length - 1) {
                res.append(", ");
            } else {
                res.append(" ");
            }
        }
        res.append(a[0].toUpperCase());
        return res.toString();
    }
}
