package j02017;
import java.util.*;
public class j02017 {
    public static Scanner input  = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        testCase();
    }
    public static void testCase() {
        int n = input.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        boolean ok = true;
        while (ok) {
            ok = false;
            for (int i = 1; i < a.size(); i++) {
                if ((a.get(i) + a.get(i - 1)) % 2 == 0) {
                    ok = true;
                    a.remove(i - 1);
                    a.remove(i - 1);
                }
            }
        }
        System.out.println(a.size());
    }
}
