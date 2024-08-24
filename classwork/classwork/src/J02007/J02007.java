package J02007;

import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = input.nextInt();
            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++){
                int x = input.nextInt();
                if (mp.containsKey(x)) {
                    mp.put(x, mp.get(x) + 1);
                } else {
                    mp.put(x, 1);
                }
            }
            System.out.printf("Test %d:\n", j);
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                System.out.printf("%d xuat hien %d lan\n", entry.getKey(), entry.getValue());
            }
        }
        input.close();
    }
}
