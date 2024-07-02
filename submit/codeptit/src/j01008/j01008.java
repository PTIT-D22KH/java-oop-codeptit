package j01008;

import java.util.Scanner;

public class j01008 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            TestCase test = new TestCase();
            test.testCase(n);
            System.out.println();
        }
    }
}
