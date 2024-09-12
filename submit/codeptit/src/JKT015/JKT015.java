package JKT015;
import java.util.*;
public class JKT015 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int j = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '<') ) {
                if (j > 0) {
                    j--;
                }
                
            } else if (s.charAt(i) == '>') {
                if (j < res.length()) {
                    j++;
                }
                
            }  else if (s.charAt(i) == '-' ) {
                if (j > 0) {
                    res.deleteCharAt(j - 1);
                    j--;
                }
            }
            else {
                res.insert(j, s.charAt(i));
                j++;
            }
            // System.out.println(res.toString());

        }
        System.out.println(res.toString());
    }
}
