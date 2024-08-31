package Jkt014;
import java.util.*;
public class Jkt014 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();

            }
            int res[] = new int[n];
            ArrayList<Integer> st = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                while (st.size() > 0 && a[st.getLast()] <= a[i]) {
                    st.removeLast();
                }
                if (st.size() == 0) {
                    res[i] = i + 1;
                } else {
                    res[i] = i - st.getLast();
                }
                st.add(i);
            }
            for (int x : res) {
                System.out.printf("%d ", x);
            }
        }   
        

    }
}
