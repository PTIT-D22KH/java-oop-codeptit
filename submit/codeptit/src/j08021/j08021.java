package j08021;

import java.util.Scanner;
import java.util.Stack;

public class j08021 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            testCase();
        }
        
    }
    public static void testCase (){
        String s = input.nextLine();
        int n = s.length();
        int res = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (!st.empty()) {
                    res = Math.max(res, i - st.peek());
                } else if (st.empty()) {
                    st.push(i);
                }
                
            }
        }
        System.out.println(res);
    }
}
