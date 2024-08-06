package j08020;

import java.util.Scanner;
import java.util.Stack;

public class j08020 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();

        while(t-- > 0) {
            testCase();
        }
        
    }
    public static boolean isOpen(char c) {
        return (c == '(' || c == '[' || c == '{');
    }
    public static boolean isPair(char a, char b) {
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }
    public static void testCase( ){
        Stack<Character> st = new Stack<>();
        String s = input.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpen(c)) {
                st.push(c);
            } else {
                if (st.empty() || !isPair(st.peek(), c)) {
                    System.out.println("NO");
                    return;
                } else {
                    st.pop();
                }
            }
        }
        if (!st.empty()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        
    }
}
