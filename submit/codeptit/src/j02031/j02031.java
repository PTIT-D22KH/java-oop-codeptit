package j02031;

import java.util.*;

public class j02031 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a.get(j) < a.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Collections.swap(a, i, minIndex);
            }
            List<Integer> b = new ArrayList<>(a);
            res.add(b);
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.printf("Buoc %d: ", i + 1);
            for (int x : res.get(i)) {
                System.out.printf("%d ", x);
            }
            System.out.println();
        }
        input.close();
    }
}
