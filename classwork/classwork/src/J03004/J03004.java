package J03004;

import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            String name = input.nextLine();
            System.out.println(nameNormalization(name));
        }
        input.close();
    }
    public static String nameNormalization(String s) {
         StringBuilder res = new StringBuilder();
         StringTokenizer token = new StringTokenizer(s);
         while (token.hasMoreTokens()) {
            String word = token.nextToken();
            
            res.append(Character.toUpperCase(word.charAt(0)));
            for (int i = 1; i < word.length(); i++) {
                res.append(Character.toLowerCase(word.charAt(i)));

            }
            res.append(" ");
         }
         return res.toString().trim();
    }
}
