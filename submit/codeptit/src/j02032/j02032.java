package j02032;
import java.util.*;
public class j02032 {
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
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        for (int i = 0; i < n; i++) {
            boolean is_swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    Collections.swap(a, j, j + 1);
                    is_swapped = true;
                }
            }
            if (!is_swapped) {
                break;
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

    }
}
