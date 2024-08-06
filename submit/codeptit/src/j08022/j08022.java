package j08022;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class j08022 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
            System.out.println();
        }
        
    }
    public static void testCase() {
        int n = input.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextLong());
        }

        Stack<Long> st = new Stack<>();
        long res[] = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while(!st.empty() && a.get(i) >= st.peek()) {
                st.pop();
            }
            if (st.empty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(a.get(i));
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", res[i]);
        }

    }
    
}
