package Jkt014;
import java.util.*;

public class Jkt014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = input.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            int res[] = new int[n];
            ArrayList<Integer> st = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                while (st.size() > 0 && a[st.get(st.size() - 1)] <= a[i]) {
                    st.remove(st.size() - 1);
                }
                if (st.size() == 0) {
                    res[i] = i + 1;
                } else {
                    res[i] = i - st.get(st.size() - 1);
                }
                st.add(i);
            }

            for (int x : res) {
                System.out.printf("%d ", x);
            }
            System.out.println(); // Print a new line after each test case
        }

        input.close();
    }
}