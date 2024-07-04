package j02016;

import java.util.*;

public class j02016 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }

    }
    public static void testCase() {
        int n = input.nextInt();
        long []a = new long[n];
        Set<Long> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = input.nextLong();
            a[i] *= a[i];
            s.add(a[i]);
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.contains(a[i] + a[j])) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
