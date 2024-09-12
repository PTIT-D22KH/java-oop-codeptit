package J03019;
import java.util.*;
public class J03019 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        StringBuilder res = new StringBuilder();
        char maxChar = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char curr = s.charAt(i);
            if (curr >= maxChar) {
                res.append(curr);
                maxChar = curr;
            }
        }
        res.reverse();
        System.out.println(res.toString());
        input.close();
    }
}
