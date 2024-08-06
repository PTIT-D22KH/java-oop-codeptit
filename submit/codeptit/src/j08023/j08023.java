package j08023;

import java.util.Scanner;
import java.util.Stack;

public class j08023 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
            // System.out.println();
        }
        input.close();
    }

    private static void testCase() {
        int n = input.nextInt();
        int[] a = new int[n + 1];
        int[] l = new int[n + 1];
        int[] r = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = input.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 1; i <= n; i++) {
            while (!st.empty() && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                l[i] = 1;
            } else {
                l[i] = st.peek() + 1;
            }
            st.push(i);
        }
        st.clear();
        for (int i = n; i >= 1; i--) {
            while (!st.empty() && a[i] <= a[st.peek()]) {
                st.pop();

            }
            if (st.empty()) {
                r[i] = n;
            } else {
                r[i] = st.peek() - 1;
            }
            st.push(i);
        }
        long res = 0;
        for (int i =1; i <= n; i++) {
            long temp = (long)a[i] * (r[i] - l[i] + 1);
            res = Math.max(res, temp);
        }
        System.out.println(res);
    }
}
