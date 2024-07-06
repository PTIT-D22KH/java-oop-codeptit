package j03009;

import java.util.*;

public class j03009 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            testCase();
            System.out.println();
        }
    }
    public static void testCase() {
        String s1 = input.nextLine().trim();
        String s2 = input.nextLine().trim();
        List<String> a = Arrays.asList(s1.split("\\s+"));
        List<String> b = Arrays.asList(s2.split("\\s+"));
        Set<String> res = new TreeSet<>();
        for (String s : a) {
            if (!b.contains(s)) {
                res.add(s);
            }
        }
        for (String s : res) {
            System.out.printf("%s ", s);
        }
    }
}
