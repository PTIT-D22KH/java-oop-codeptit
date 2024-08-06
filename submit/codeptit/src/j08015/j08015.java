package j08015;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class j08015 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase(){ 
        int n = input.nextInt();
        long k = input.nextLong();
        long res = 0;
        ArrayList<Long> a = new ArrayList<>();
        Map<Long, Long> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long x = input.nextLong();
            a.add(x);
            mp.put(x, mp.containsKey(x) ? mp.get(x) + 1 : 1);
        }
        for (int i = 0; i < n; i++) {
            long curr = k - a.get(i);
            if (mp.containsKey(curr)) {
                if (curr == a.get(i)) {
                    res += mp.get(curr) - 1;
                } else {
                    res += mp.get(curr);
                }
            }
        }
        System.out.println(res / 2);

    }

}
