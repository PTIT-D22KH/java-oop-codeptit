package J02007;

import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = input.nextInt();
            int a[] = new int[n];
            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++){
                a[i] = input.nextInt();
                if (mp.containsKey(a[i])) {
                    mp.put(a[i], mp.get(a[i]) + 1);
                } else {
                    mp.put(a[i], 1);
                }
            }
            System.out.printf("Test %d:\n", j);
            for (int i = 0; i < n; i++) {
                if (mp.containsKey(a[i])) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], mp.get(a[i]));
                    mp.remove(a[i]);
                }
            }
        }
        input.close();
    }
}
