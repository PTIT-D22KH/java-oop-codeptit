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
        }
        
    }
    public static void testCase() {
        int n = input.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextLong());
        }
        
        Stack<Integer> st = new Stack<>();


    }
    
}
