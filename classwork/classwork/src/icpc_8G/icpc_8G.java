package icpc_8G;
import java.util.*;
public class icpc_8G {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String x = input.nextLine();
        Set<Integer> se = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            int res = s.indexOf(x, i);
            if (res != -1) {
                se.add(res + 1);
            }
        }
        for (int t : se) {
            System.out.printf("%d ", t);
        }
    }
}
