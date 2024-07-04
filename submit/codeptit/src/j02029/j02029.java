package j02029;
import java.util.*;
public class j02029 {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner input  = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            List<Integer> a = new ArrayList<>();
            List<List<Integer>> res  = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(input.nextInt());
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a.get(i) > a.get(j)) {
                        Collections.swap(a, i, j);
                    }
                }
                List<Integer> b = new ArrayList<>(a);
                res.add(b);
            }
            for (int i = res.size() - 1; i >= 0; i--) {
                System.out.printf("Buoc %d: ", i + 1);
                for (int j : res.get(i)) {
                    System.out.printf("%d ", j);
                }
                System.out.println();
            }
        }
        input.close();
    }
    public static void testCase(Scanner input) {
        
    }
}
