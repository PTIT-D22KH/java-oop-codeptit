package j02030;
import java.util.*;
public class j02030 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
            Collections.sort(a);
            List<Integer> b = new ArrayList<>(a);
            res.add(b);
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.printf("Buoc %d: ", i);
            for (int x : res.get(i)) {
                System.out.printf("%d ", x);
            }
            System.out.println();
        }
        input.close();


    }
}
