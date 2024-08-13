package j03010;

import java.util.*;

public class j03010 {
    public static Scanner input = new Scanner(System.in);
    public static Map<String, Integer> mp = new HashMap<>();
    public static void main(String[] args) {
        // Write your code here
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            testCase();

        }
    }
    public static void testCase() {
        String s = input.nextLine().trim();
        String[] a = s.toLowerCase().split("\\s+");
        String res = a[a.length - 1];
        String postfix = "@ptit.edu.vn";
        
        for (int i = 0; i < a.length - 1; i++ ){
            res += a[i].charAt(0);
        }
        // System.out.println(res);
        if (mp.containsKey(res)) {
            mp.put(res, mp.get(res) + 1);
        } else {
            mp.put(res, 1);
        }
        int stt = mp.get(res);
        // System.out.println(stt);
        if (stt > 1) {
            res += String.valueOf(stt);
        }
        res += postfix;
        System.out.println(res);
    }
}
