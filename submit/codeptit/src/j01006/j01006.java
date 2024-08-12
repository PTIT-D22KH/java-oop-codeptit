package j01006;

import java.util.Scanner;

public class j01006 {
    // public static 
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while (t-- > 0) {
            int n = input.nextInt();
            FibonacciNumber f = new FibonacciNumber(n);
            long res = f.getNthFiboNumber(n);
            System.out.println(res);
        }
        input.close();
    }
    // public static void testCase(Scanner input) {
    //     int n = input.nextInt();
    //     FibonacciNumber f = new FibonacciNumber(n);
    //     long res = f.getNthFiboNumber(n);
    //     System.out.println(res);
    //     // System.out.println(res);
    //     // System.out.println(f.getNthFiboNumber(n));
    // }
}
