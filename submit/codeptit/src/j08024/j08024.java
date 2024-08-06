package j08024;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class j08024 {
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
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(9);
        while (true) {
            Integer a = dq.getFirst();
            dq.remove(a);
            if (a % n == 0) {
                System.out.println(a);
                return;
            } else {
                dq.add(a * 10);
                dq.add(a * 10 + 9);
            }
        }
    }
}
